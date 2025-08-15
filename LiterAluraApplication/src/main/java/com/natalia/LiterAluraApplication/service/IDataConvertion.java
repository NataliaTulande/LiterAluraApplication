package com.natalia.LiterAluraApplication.service;

public interface IDataConvertion {
    <T> T convertData(String json, Class<T> clase);
}
