package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	
	
	  public void testInsert() { BoardVO board = new BoardVO();
	  board.setTitle("새 글 제목");//제목 board.setWriter("새 글 작성자");//작성자
	  board.setContent("새 글 내용");//내용
	  
	  mapper.insert(board); log.info(board);
	  
	  }

	

	 public void testSelectKey() { BoardVO board = new BoardVO();
	  board.setTitle("새 글 제목");//제목 board.setWriter("새 글 작성자");//작성자
	 board.setContent("새 글 내용");//내용
	 
	  mapper.insertSelectKey(board); log.info(board); testGetList(); }

	
	
	public void testRead() {
		
	BoardVO board=	mapper.read(1L);
		
	log.info(board);
	
	}
	
	@Test
	public void testDelete() {//삭제 쿼리
		
	int result = mapper.delete(3L);	
		
	log.info("DELETE COUNT : "+ result );	
	
	
	
		
	}
	
	@Test
	public void testUpdate() {
	
		BoardVO board = new BoardVO();
		board.setBno(6L);//long 타입이라서 L을 붙여야하고
		board.setTitle("뭐야");
		board.setContent("점심밥");
		board.setWriter("user00");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT : " + count);
		
	}
	
	
	
	public void testGetList() {
	
		mapper.getList().forEach(board -> log.info(board));
	}
	

	
	
	
}//end class
