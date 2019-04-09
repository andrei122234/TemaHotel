package Tema1;


class Client {
  public String firstClientName;
  public String lastClientName;
  public String email;
  public long phone;
  public long creditCard;

  public Client(String firstClientName, String lastClientName,String email,long phone, long creditCard){
      this.firstClientName = firstClientName;
      this.lastClientName = lastClientName;
      this.email = email;
      this.creditCard = creditCard;
      this.phone = phone;



    }

    public String getLname() {
        return lastClientName;
    }

    public void setLname(String lname) {
        this.lastClientName = lname;
    }

    public String getFname() {
        return firstClientName;
    }

    public void setFname(String fname) {
        this.firstClientName = fname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
