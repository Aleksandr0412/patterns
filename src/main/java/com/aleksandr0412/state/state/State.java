package com.aleksandr0412.state.state;

import com.aleksandr0412.state.Context;
import com.aleksandr0412.state.Document;

public interface State {
    void insertMoney(Context context, int money);

    void selectDevice(Context context, String device);

    void selectDocument(Context context, Document document);

    void print(Context context);

    void returnMoney(Context context);
}
