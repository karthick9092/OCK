package ockart;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ockart.util.amazon.FlipkartUtils;
import com.ockart.util.amazon.PrepareEntityService;
import com.ockart.util.amazon.bean.ProductInfo;


public class SaveProductsTest {
	
	private static Map<String, String> productDirectory;
	
	private static List<ProductInfo> productInfoList = null;

	@SuppressWarnings("rawtypes")
	public static void main (String args[]) throws Exception {
		try {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("xml-configuration/spring-hibernate-integration.xml");
			FlipkartUtils flipkartUtils  = context.getBean(FlipkartUtils.class);
			PrepareEntityService prepareEntityService  = context.getBean(PrepareEntityService.class);
			flipkartUtils.initializeConfigDetails();
			productDirectory = flipkartUtils.getFKProductDirectory();
			if (productDirectory != null && productDirectory.size() != 0) {				
				Iterator itr = productDirectory.entrySet().iterator();
				while (itr.hasNext()) {
					Map.Entry mapEntry = (Map.Entry) itr.next();
					productInfoList = flipkartUtils.getProductList(mapEntry
							.getKey().toString(), mapEntry.getValue()
							.toString());
					mapToRespectiveEntity(productInfoList, mapEntry.getKey().toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private static void mapToRespectiveEntity(
			List<ProductInfo> productInfoList, String string) {
		// TODO Auto-generated method stub
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
