package Company;

import Language.Language;
import MessagePackage.MessagePackage;
import MessagePackage.MessageSender;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Integer> customerIdList;
    private Language companyLanguage;
    private MessagePackage smsPackage;
    private MessagePackage emailPackage;
    private boolean isBlackListed;
    private MessageSender messageSender;
    private Invoice companyInvoice;

    public Company(String companyName, Language language){
        this.companyName = companyName;
        this.customerIdList = new ArrayList<Integer>();
        this.companyLanguage = language;
        this.isBlackListed = false;
        this.messageSender = new MessageSender();
    }

    public void setSmsPackage(MessagePackage smsPackage){
        this.smsPackage = smsPackage;
        companyInvoice = new Invoice();
        companyInvoice.setAmount(smsPackage.getPackagePrice());
    }

    public void sendSms(){
        messageSender.sendMessage(this, this.smsPackage);
    }

    public void sendEmail(){
        messageSender.sendMessage(this, this.emailPackage);
    }

    public ArrayList<Integer> getCustomerIdList() {
        return customerIdList;
    }

    public ArrayList<Integer> addCustomerToCustomerIdList(ArrayList<Integer> customerIdList, int newCustomerId) {
        customerIdList.add(Integer.valueOf(newCustomerId));
        return customerIdList;
    }


    public void setEmailPackage(MessagePackage emailPackage){
        this.emailPackage = emailPackage;
    }

    public MessagePackage getSmsPackage() {
        return this.smsPackage;
    }

    public MessagePackage getEmailPackage() {
        return this.emailPackage;
    }


    public Language getCompanyLanguage() {
        return companyLanguage;
    }

    public void setCompanyLanguage(Language companyLanguage) {
        this.companyLanguage = companyLanguage;
    }


    public boolean isBlackListed() {
        return isBlackListed;
    }

    public void setBlackListed(boolean blackListed) {
        isBlackListed = blackListed;
    }

    public Invoice getCompanyInvoice() {
        return companyInvoice;
    }

    public void setCompanyInvoice(Invoice companyInvoice) {
        this.companyInvoice = companyInvoice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
