package com.wuruoye.news.contract

import com.wuruoye.library.contract.WIView
import com.wuruoye.library.contract.WPresenter


class ImgContract {
    interface View : WIView {

    }

    abstract class Presenter : WPresenter<View>() {

    }
}