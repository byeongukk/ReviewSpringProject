package com.test.tsp.board.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.tsp.board.model.vo.Board;

public class BoardInsertValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Board.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Board reqBoard = (Board) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bTitle","required", "필수입력 사항입니다.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bContent","required", "필수입력 사항입니다.");
		if(reqBoard.getbTitle().length() < 5 || reqBoard.getbTitle().length() > 20) {
			errors.rejectValue("bTitle","lengthsize","제목은 5~20글자 사이로 작성해주십시오");
		}
		if(reqBoard.getbContent().length() < 10) {
			errors.rejectValue("bContent","lengthsize","10글자 이상 입력해주십시오");
		}
	
	}

}
