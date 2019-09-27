package itc.hoseo.soolfarm.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import itc.hoseo.soolfarm.model.QnABoardVO;

@Mapper
public interface QnABoardDAO {
	// QnA 추가
	public int addQnA(QnABoardVO vo);

	// QnA 수정
	public boolean modifyQnA(QnABoardVO vo);

	// QnA 삭제
	public int deleteQnA(QnABoardVO vo);
	
	// QnA 검색
	public List<QnABoardVO> list(QnABoardVO vo);
}
