package com.ockart.util.amazon;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ockart.util.amazon.bean.ProductInfo;
import com.ockart.util.amazon.helper.FlipkartCategoryConstant;

@Service
public class PrepareEntityService {

	public void mapToRespectiveEntity(List<ProductInfo> productInfoList, String category) {
		// TODO Auto-generated method stub
		try {
			if (productInfoList != null && productInfoList.size() != 0) {
				if (category.equals(FlipkartCategoryConstant.MOBILES)) {
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
