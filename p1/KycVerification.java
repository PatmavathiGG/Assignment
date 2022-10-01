package p1;

public class KycVerification {
	private String panNumber;
	private long adhaarNumber;
	private String documentType;
	private String documentNumber;

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public long getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(long adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

/*	@Override
	public String toString() {
		return "KycVerification [panNumber=" + panNumber + ", adhaarNumber=" + adhaarNumber + ", documentType="
				+ documentType + ", documentNumber=" + documentNumber + "]";
	}*/

	public KycVerification(String panNumber2, long adhaarNumber2, String documentType2) {
		super();
		// TODO Auto-generated constructor stub
	}

	public KycVerification(String panNumber, long adhaarNumber, String documentType, String documentNumber) {
		super();
		this.panNumber = panNumber;
		this.adhaarNumber = adhaarNumber;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

}
