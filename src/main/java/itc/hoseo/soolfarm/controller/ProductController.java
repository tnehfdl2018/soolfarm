package itc.hoseo.soolfarm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import itc.hoseo.soolfarm.goods.GoodsService;
import itc.hoseo.soolfarm.model.GoodsVO;
import itc.hoseo.soolfarm.model.ShoppingCartVO;
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
	
	// 상품 등록
		@GetMapping("addProduct")
		public String addProduct(@ModelAttribute GoodsVO vo, ModelMap model) {
			
			
			return "admin/addProduct";
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
	
	
	// 장바구니에 담기
	@PostMapping("porductDetail")
	public String addShoppingCart(@ModelAttribute ShoppingCartVO vo, ModelMap model, HttpSession session) {	
		// 파라미터로 가져온 상품번호와, 세션을 이용해 가져온 사용자를 아이디를 세트한다.
		
		String id = (String) session.getAttribute("email");
		
		vo.setSbUser(id);
		model.put("cart", cartService.addShoppingCart(vo));	

		return"redirect:/detail?gdNum=" + vo.getSbNum();
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
