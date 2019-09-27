package itc.hoseo.soolfarm.delivery;

public interface DeliveryService {
	
	// 배송상태 추가
	public Delivery addDelivery(Delivery d);
	
	// 배송상태 삭제
	public DeliveryVO movToBuyed(int goodsNum); 

}
