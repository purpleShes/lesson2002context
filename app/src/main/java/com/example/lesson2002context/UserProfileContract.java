package com.example.lesson2002context;

public interface UserProfileContract {
    interface View {
        void showUser(User user);
        void showProgress(boolean isVisible);
        void setActions(Actions actions);
    }
    interface  Actions{
        void deleteProfileClicked();
    }
}
