package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	public int update(BoardVO board);//수정하는것
	
	public int delete(Long bno);//게시물 하나 삭제
	
	public BoardVO read(Long bno);//게시물 하나 조회
	
	public void insert(BoardVO board); //게시물 단순추가
	
	public Integer insertSelectKey(BoardVO board);//게시물 추가후 bno 반환
	
	
//@Select("SELECT * from tbl_board where bno > 0") 직접 보내는 쿼리  
	//자바 컴파일 하고 바뀔때 문제가 된다  JDBC 에 쓰는게 훨씬 좋다
	public List<BoardVO> getList();
	
}

