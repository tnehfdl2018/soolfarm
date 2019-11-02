package itc.hoseo.soolfarm.controller;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import itc.hoseo.soolfarm.goods.GoodsService;
import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.ShoppingCartVO;
import itc.hoseo.soolfarm.shoppingCart.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ProductController {
	@Autowired
	private Environment env;
	
	@Autowired
	GoodsService proService;
	@Autowired
	ShoppingCartService cartService;

	@GetMapping("product")
	public String product(ModelMap model) {
		model.put("prod", proService.getGoods());
		return "product/product";
	}

	// 상품 등록
	@PostMapping("addPro")
	public String addProduct(@ModelAttribute GoodsVO vo) {
		if(vo.getImgFile() != null) {
			MultipartFile mf = vo.getImgFile();
			vo.setGdImg(mf.getOriginalFilename());
			try {
				mf.transferTo(Paths.get(env.getProperty("soolfarm.imgupload"),mf.getOriginalFilename() ));
			} catch (IOException e) {
				throw new RuntimeException("상품 이미지 등록 실패", e);
			}
		}
		if (proService.addProduct(vo)) {
			return "admin/productRegistration";
		}
		return "admin/productRegistration";
	}

	// 상품 삭제
	@GetMapping("prodDelete")
	public String productDelete(@RequestParam(value = "gdNum") int gdNum) {

		proService.deleteGoods(gdNum);

		return "redirect:/productRegistration";
	}

	// 상품 정보 페이지
	@GetMapping("detail")
	@DateTimeFormat(pattern = "YYYY-MM-dd") // 페이지내 날짜 출력을 위한 포멧 설정
	public String productDetail(@RequestParam(value = "gdNum") int gdNum, ModelMap model) {
		// 상품 번호를 받는다.

		model.put("prodDetail", proService.getDetailProduct(gdNum));
		// 받은 상품번호를 가지고 DB에서 조회하여 해당하는 상품의 정보를 뿌려준다.

		return "product/productDetail";
	}

	// 장바구니에 담기
	@PostMapping("porductDetail")
	@ResponseBody
	public Map<String,Object> addShoppingCart(@ModelAttribute ShoppingCartVO vo, ModelMap model, HttpSession session) {
		String userName = (String)session.getAttribute("email");
		vo.setSbUser(userName);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("rslt", cartService.addShoppingCart(vo));
		rMap.put("vo", vo);

		return rMap;
	}

	// 장바구니 불러오기
	@GetMapping("shoppingCart")
	public String getShoppingCart(@ModelAttribute ShoppingCartVO vo, HttpSession session, ModelMap model) {

		String id = (String) session.getAttribute("email");
		vo.setSbUser(id);
		model.put("cart", cartService.getShoppingCart(vo));

		return "product/shoppingCart";
//		return "redirect:/shoppingCart?sbUser=" + vo.getSbUser();
	}

}
