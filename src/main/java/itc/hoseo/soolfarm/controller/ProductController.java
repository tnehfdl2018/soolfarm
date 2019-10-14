package itc.hoseo.soolfarm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import itc.hoseo.soolfarm.goods.GoodsService;
import itc.hoseo.soolfarm.model.MemberVO;
import itc.hoseo.soolfarm.model.ShoppingCartVO;
import itc.hoseo.soolfarm.shoppingCart.ShoppingCartDAO;
import itc.hoseo.soolfarm.shoppingCart.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ProductController {
	
	@Autowired
	GoodsService proService;
	@Autowired
	ShoppingCartService cartService;
	
	@GetMapping("product")
	public String product(ModelMap model) {
		model.put("prod", proService.getGoods());
		return "product/product";
	}
	
	@GetMapping("about")
	public String productDetail2(ModelMap model) {
		model.put("prod", proService.getGoods());
		return "product/productDetail";
	}
	
	// 상품 정보 페이지 
	@GetMapping("detail")
	@DateTimeFormat(pattern="YYYY-MM-dd") // 페이지내 날짜 출력을 위한 포멧 설정
	public String productDetail(@RequestParam (value="gdNum") int gdNum, ModelMap model) {	
		// 상품 번호를 받는다.
		
		model.put("prodDetail", proService.getDetailProduct(gdNum));
		// 받은 상품번호를 가지고 DB에서 조회하여 해당하는 상품의 정보를 뿌려준다.
		
		return "product/productDetail";
	}
	
	@GetMapping("addShoppingCart")
	public String addShoppingCart(@RequestParam (value = "gdNum") int gdNum, ModelMap model, HttpSession session) {
		ShoppingCartVO sVo = new ShoppingCartVO();
		MemberVO mVo = new MemberVO();
		// 세션을 이용하여 로그인 되어있는 사용자의 아이디를 가져온다.
		session.setAttribute("email", mVo.getEmail());
		
		// 파라미터로 가져온 상품번호와, 세션을 이용해 가져온 사용자를 아이디를 세트한다.
		sVo.setSbNum(gdNum);
		sVo.setSbUser("email");
		
		model.put("cart", cartService.addShoppingCart(sVo));
		
		
		return "shoppingCart";
	}

}
