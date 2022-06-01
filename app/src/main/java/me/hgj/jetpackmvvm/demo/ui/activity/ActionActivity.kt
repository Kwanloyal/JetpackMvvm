package me.hgj.jetpackmvvm.demo.ui.activity

import android.os.Bundle
import me.hgj.jetpackmvvm.base.activity.BaseVmActivity
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.demo.R

class ActionActivity : BaseVmActivity<BaseViewModel>() {
    override fun layoutId(): Int {
        return R.layout.activity_action
    }

    override fun initView(savedInstanceState: Bundle?) {

    }

    override fun showLoading(message: String) {

    }

    override fun dismissLoading() {

    }

    override fun createObserver() {

    }
}