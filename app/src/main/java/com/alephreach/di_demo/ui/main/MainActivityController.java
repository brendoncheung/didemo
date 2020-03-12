package com.alephreach.di_demo.ui.main;

import com.alephreach.di_demo.domain.usecase.GetAllItemsUseCase;

public class MainActivityController {

    private final GetAllItemsUseCase mGetAllItemsUseCase;

    public MainActivityController(GetAllItemsUseCase useCase) {
        mGetAllItemsUseCase = useCase;
    }

    public void onStart() {
        mGetAllItemsUseCase.execute();
    }

    public void onStop() {

    }




}
