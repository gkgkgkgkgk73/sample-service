package com.demo.microservices.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SampleUser {
	private String userId; //사용자 아이디
	private String userNm; // 이름
	private String addr; //주소
	private String cellPhone; //핸드폰
	private String agreeInform; //고객정보 동의 여부
	private String birthDt; // 생년월일
}
