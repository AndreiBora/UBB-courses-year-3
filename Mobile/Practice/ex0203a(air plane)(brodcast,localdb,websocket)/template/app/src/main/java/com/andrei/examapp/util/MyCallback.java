package com.andrei.examapp.util;

import com.andrei.examapp.model.GenericEntity;

public interface MyCallback {
    void onCall(GenericEntity entity);

    void onCall(GenericEntity entity,Integer miles);
}
