package entity;

public class Customers {
	    private Integer id;
	    private String customerName;
	    private String customerNumber;
	    private String customerEmail;
	    private String it;
	  

	    public Customers() {
	    }

	    public Customers(Integer id, String customerName) {
	        this.id = id;
	        this.customerName = customerName;
	    }
	    
	    public Customers(Integer id, String customerName, String customerNumber, String customerEmail, String it) {
	        this.id = id;
	        this.customerName = customerName;
	        this.customerNumber = customerNumber;
	        this.customerEmail = customerEmail;
	        this.it = it;
	    }
	    
	    
	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public String getCustomerNumber() {
	        return customerNumber;
	    }

	    public void setCustomerNumber(String customerNumber) {
	        this.customerNumber = customerNumber;
	    }

	    public String getCustomerEmail() {
	        return customerEmail;
	    }

	    public void setCustomerEmail(String customerEmail) {
	        this.customerEmail = customerEmail;
	    }

	    public String getIt() {
	        return it;
	    }

	    public void setIt(String it) {
	        this.it = it;
	    }

		@Override
		public String toString() {
			return "Customers [id=" + id + ", customerName=" + customerName + ", customerNumber=" + customerNumber
					+ ", customerEmail=" + customerEmail + ", it=" + it + "]";
		}}
