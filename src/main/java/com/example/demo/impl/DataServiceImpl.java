package com.example.demo.impl;

import com.example.demo.config.ApplicationProperties;
import com.example.demo.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {

//    @Value("${welcome.text}")
//    private String welcomeText;
//
//    @Value("${bank.name}")
//    private String bankName;
//
//    @Value("${username}")
//    private String userName;

    @Autowired
    private ApplicationProperties applicationProperties;

    @Override
    public String sayGreeting() {
        String data = applicationProperties.getWelcomeText()+ "\nNama Bank = " +applicationProperties.getName()+ "\nNama = " +applicationProperties.getUsername();
        return data;
    }

    // MEMBUAT GETTER DAN SETTER
    public ApplicationProperties getApplicationProperties(){
        return applicationProperties;
    }

    public void setApplicationProperties(ApplicationProperties applicationProperties){
        this.applicationProperties = applicationProperties;
    }



//    // MEMBUAT GETTER DAN SETTER
//    public String getWelcomeText(){
//        return welcomeText;
//    }
//
//    public void setWelcomeText(String welcomeText){
//        this.welcomeText = welcomeText;
//    }
//
//    public String getBankName(){
//        return bankName;
//    }
//
//    public void setBankName(String bankName){
//        this.bankName = bankName;
//    }
//
//    public String getUserName(){
//        return userName;
//    }
//
//    public void setUserName(String userName){
//        this.userName = userName;
//    }


}
