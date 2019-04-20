package com.example.lesson2002context;

public class UserProfilePresenter implements UserProfileContract.Actions {
    private UserProfileContract.View view;
    private User user;

    public UserProfilePresenter(UserProfileContract.View view) {
        this.view = view;
    }

    private void truyToShowUser() {
        view.showProgress(true);
        User user = downloadData();

        view.showProgress(false);
        view.showUser(user);
    }

    private User downloadData() {
        return new User(232148, "Katya");
    }

    @Override
    public void deleteProfileClicked() {
        user = null;

    }
}
