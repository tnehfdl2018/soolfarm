package itc.hoseo.soolfarm.delivery;

import itc.hoseo.soolfarm.model.DeliveryVO;

public interface DeliveryService {
	
	// 배송상태 추가
	public DeliveryVO addDelivery(DeliveryVO d);
	
	// 배송상태 삭제
	public DeliveryVO movToBuyed(int gdNum); 

}
