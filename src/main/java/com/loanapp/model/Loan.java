package com.loanapp.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter
@Setter
@NoArgsConstructor
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanNumber;
	private String memberName;
	private String loanType;
	private String loanTerm;  
	private long amount;
	private Date originDate;
	
	//@JsonFormat(pattern="dd-MM-yyyy")
	private Date endDate;

	public Loan(String memberName, String loanType, String loanTerm, long amount, Date originDate, Date endDate) {
	
		this.memberName = memberName;
		this.loanType = loanType;
		this.loanTerm = loanTerm;
		this.amount = amount;
		this.originDate = originDate;
		this.endDate = endDate;
	}

	
}
 