package com.literalura.challenge.service;

public interface IConvertData{

    <T> T getData(String json, Class<T> clazz);
}