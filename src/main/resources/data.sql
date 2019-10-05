INSERT INTO MEMBER (email, pw, name, tel, address, date) VALUES('tnehfdl2011@gmail.com', '12345', '최수빈', '010-2042-1992', '서울시 강북구 삼양동', sysdate)
INSERT INTO MEMBER (email, pw, name, tel, address, date) VALUES('tnehfdl2004@naver.com', '23456', '수빈','010-2042-1992', '서울시 강북구 삼양동', sysdate)
INSERT INTO MEMBER (email, pw, name, tel, address, date) VALUES('tnehfdl2002@hanmail.net', '34567', '수비니', '010-2042-1992', '서울시 강북구 삼양동', sysdate)
INSERT INTO MEMBER (email, pw, name, tel, address, date) VALUES('tnehfdl2002@yahoo.co.kr', '45678', '숩쵸이', '010-2042-1992', '서울시 강북구 삼양동', sysdate)
INSERT INTO MEMBER (email, pw, name, tel, address, date) VALUES('ferendevelop@gmail.com', '56789', '정성태', '010-4083-8192', '서울시 강서구 마곡동', sysdate)

	
INSERT INTO GOODS (gd_name, gd_img, gd_kinds, gd_price, gd_maker, gd_discription) VALUES('참이슬 Fresh','irin_goods.png','소주','1,500원','하이트진로','소주는 역시 참이슬이지')
INSERT INTO GOODS (gd_name, gd_img, gd_kinds, gd_price, gd_maker, gd_discription) VALUES('처음처럼','suzy_goods.png','소주','1,500원','롯데주류','아닌것 같지만 우리나라 소주')
INSERT INTO GOODS (gd_name, gd_img, gd_kinds, gd_price, gd_maker, gd_discription) VALUES('좋은데이','son_goods.png','소주','1,500원','무학소주','그냥 그런 소주')
INSERT INTO GOODS (gd_name, gd_img, gd_kinds, gd_price, gd_maker, gd_discription) VALUES('카스','cass_goods.jpg','맥주','3,500원','OB맥주','시원한 맥주')
INSERT INTO GOODS (gd_name, gd_img, gd_kinds, gd_price, gd_maker, gd_discription) VALUES('하이트','yeona_goods.jpg','맥주','3,500원','하이트진로','맛있는 맥주')


INSERT INTO SHOPPINGBASKET (sb_name, sb_img, sb_kinds, sb_price, sb_maker, sb_status) VALUES('참이슬 Fresh','irin_goods.png','소주','1,500원','하이트진로','주문 접수 대기')
INSERT INTO SHOPPINGBASKET (sb_name, sb_img, sb_kinds, sb_price, sb_maker, sb_status) VALUES('처음처럼','suzy_goods.png','소주','1,500원','롯데주류','주문 접수 대기')
INSERT INTO SHOPPINGBASKET (sb_name, sb_img, sb_kinds, sb_price, sb_maker, sb_status) VALUES('좋은데이','son_goods.png','소주','1,500원','무학소주','주문 접수 대기')
INSERT INTO SHOPPINGBASKET (sb_name, sb_img, sb_kinds, sb_price, sb_maker, sb_status) VALUES('카스','cass_goods.jpg','맥주','3,500원','OB맥주','주문 접수 대기')
INSERT INTO SHOPPINGBASKET (sb_name, sb_img, sb_kinds, sb_price, sb_maker, sb_status) VALUES('하이트','yeona_goods.jpg','맥주','3,500원','하이트진로','주문 접수 대기')
			
	
INSERT INTO DELIVERY (del_name, del_img, del_kinds, del_price, del_maker, del_status) VALUES('참이슬 Fresh','irin_goods.png','소주','1,500원','하이트진로','배송중')
INSERT INTO DELIVERY (del_name, del_img, del_kinds, del_price, del_maker, del_status) VALUES('처음처럼','suzy_goods.png','소주','1,500원','롯데주류','배송중')
INSERT INTO DELIVERY (del_name, del_img, del_kinds, del_price, del_maker, del_status) VALUES('좋은데이','son_goods.png','소주','1,500원','무학소주','배송 준비중')
INSERT INTO DELIVERY (del_name, del_img, del_kinds, del_price, del_maker, del_status) VALUES('카스','cass_goods.jpg','맥주','3,500원','OB맥주','주문 접수')
INSERT INTO DELIVERY (del_name, del_img, del_kinds, del_price, del_maker, del_status) VALUES('하이트','yeona_goods.jpg','맥주','3,500원','하이트진로','배송 준비중')


INSERT INTO BUYED (buy_name, buy_img, buy_kinds, buy_price, buy_maker, buy_status) VALUES('참이슬 Fresh','irin_goods.png','소주','1,500원','하이트진로','배송 완료')
INSERT INTO BUYED (buy_name, buy_img, buy_kinds, buy_price, buy_maker, buy_status) VALUES('처음처럼','suzy_goods.png','소주','1,500원','롯데주류','배송 완료')
INSERT INTO BUYED (buy_name, buy_img, buy_kinds, buy_price, buy_maker, buy_status) VALUES('좋은데이','son_goods.png','소주','1,500원','무학소주','배송 완료')
INSERT INTO BUYED (buy_name, buy_img, buy_kinds, buy_price, buy_maker, buy_status) VALUES('카스','cass_goods.jpg','맥주','3,500원','OB맥주','배송 완료')
INSERT INTO BUYED (buy_name, buy_img, buy_kinds, buy_price, buy_maker, buy_status) VALUES('하이트','yeona_goods.jpg','맥주','3,500원','하이트진로','배송 완료')
	

INSERT INTO QNA (post_sub, post_contant, post_writer, post_date) VALUES('맛있어요.', '룰루랄랄라~' ,'최수빈' ,sysdate)
INSERT INTO QNA (post_sub, post_contant, post_writer, post_date) VALUES('맛없어요.', '룰루랄랄라~' ,'정성태' ,sysdate)
INSERT INTO QNA (post_sub, post_contant, post_writer, post_date) VALUES('역시 Soolfarm', '룰루랄랄라~' ,'최수빈' ,sysdate)
INSERT INTO QNA (post_sub, post_contant, post_writer, post_date) VALUES('여기서만 사게 되네요.', '룰루랄랄라~' ,'정성태' ,sysdate)
INSERT INTO QNA (post_sub, post_contant, post_writer, post_date) VALUES('저렴한 술은 Soolfarm', '룰루랄랄라~' ,'최수빈' ,sysdate)


INSERT INTO BANNER (NAME, START_DTTM, END_DTTM, IMG_NAME) VALUES('수지',sysdate, null, 'suzy.png')
INSERT INTO BANNER (NAME, START_DTTM, END_DTTM, IMG_NAME) VALUES('아이린',sysdate, null, 'irin.png')
INSERT INTO BANNER (NAME, START_DTTM, END_DTTM, IMG_NAME) VALUES('하이트',sysdate, null, 'hite.png')
INSERT INTO BANNER (NAME, START_DTTM, END_DTTM, IMG_NAME) VALUES('손나은',sysdate, null, 'day.png')
INSERT INTO BANNER (NAME, START_DTTM, END_DTTM, IMG_NAME) VALUES('카스',sysdate, null, 'cass.png')


INSERT INTO ADD (NAME, IMG_NAME) VALUES('좋은데이', 'aa.jpg')
INSERT INTO ADD (NAME, IMG_NAME) VALUES('처음처럼', 'bb.jpg')
INSERT INTO ADD (NAME, IMG_NAME) VALUES('참이슬', 'cc.jpg')