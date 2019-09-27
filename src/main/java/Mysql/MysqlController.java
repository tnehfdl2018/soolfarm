package Mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MysqlController {
	
	@Autowired
	private CusMapper mapper;
	
	@RequestMapping(value = "/")
	@ResponseBody
	public String home() throws Exception{
		
		List<CustomsVO> list = mapper.selectCustomsVO();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("id : " + list.get(i).getCus_id());
			System.out.println("pw : " + list.get(i).getCus_pw());
		}
		
		return "hello";
	}
	
	
	

}
