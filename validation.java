/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crocheters.controllers;
import java.util.regex.Pattern;

/**
 *
 * @author Ekata Baral
 * LMUID 23048589
 */
public class validation {
    private static final Pattern ID_PATTERN = Pattern.compile("^11\\d{3}$");
    private static final Pattern PRODUCT_NAME_PATTERN = Pattern.compile("^[a-zA-Z]+(['-][a-zA-Z]+)*$");
    private static final Pattern CATEGORY_PATTERN = Pattern.compile("^(Sweater|Scarf|Cardigan)$");
    private static final Pattern YARN_TYPE_PATTERN = Pattern.compile("^(Cotton|Wool|Acrylic|Chunky|Cashmere)$");
    private static final Pattern PRICE_PATTERN = Pattern.compile("[-+]?[0-9]*\\\\.?[0-9]+");
    
    public static boolean isNullOrEmpty(String text){
        return text ==null || text.trim().isEmpty();
    }
    
    public static boolean isValidProdId(int prodId){
        return ID_PATTERN.matcher(String.valueOf(prodId)).matches();
    }
    
    public static boolean isValidProdName(String prodName){
        prodName = prodName.trim();//remove leading or trailing space
        prodName = prodName.replaceAll("\\s+"," ");//remove extra whitespace
        return !isNullOrEmpty(prodName) && PRODUCT_NAME_PATTERN.matcher(prodName).matches();
    }
    
    public static boolean isValidCategory(String category){
        return !isNullOrEmpty(category) && CATEGORY_PATTERN.matcher(category).matches();
    }
    
    public static boolean isValidYarnType(String yarnType){
        return !isNullOrEmpty(yarnType) && YARN_TYPE_PATTERN.matcher(yarnType).matches();
    }
    
    public static boolean isValidStock(int stock){
        return stock<100;
    }
    
    public static boolean isValidPrice(float price){
        return PRICE_PATTERN.matcher(String.valueOf(price)).matches();
    }
    
}
