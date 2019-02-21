package com.yash.document;

public class Document<E> {
	protected E name;
	protected E purpose;
	protected E validity;
	public E getName() {
		return name;
	}
	public void setName(E name) {
		this.name = name;
	}
	public E getPurpose() {
		return purpose;
	}
	public void setPurpose(E purpose) {
		this.purpose = purpose;
	}
	public E getValidity() {
		return validity;
	}
	public void setValidity(E validity) {
		this.validity = validity;
	}
	public void showDocumentDetail() {
		System.out.println("Name : "+name +","+"Purpose : " +purpose +","+ "Validity : "+validity);
	}
	public Document(E name, E purpose, E validity) {
		super();
		this.name = name;
		this.purpose = purpose;
		this.validity = validity;
	}

	

}
