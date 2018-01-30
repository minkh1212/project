package Mproject.mvc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class frDelAction implements Action {
	Logger logger = Logger.getLogger(frDelAction.class);
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		logger.info("execute ȣ�⼺��");
		
		String fr_no = req.getParameter("fr_no");
		
		String path="";
		ActionForward forward = new ActionForward();
		Map<String,Object> pMap = new HashMap<String,Object>();
		
		BoardLogic boardLogic = new BoardLogic();
		int result = 0;
		result = boardLogic.frDel(fr_no);
		
		if ( result == 0 ){
			path = "../mProject/trDelf.jsp"; 
		}
		else{
			path = "../mProject/trDels.jsp";
		}
		forward.setRedirect(false);
		forward.setPath(path);
		return forward;
	}
}
