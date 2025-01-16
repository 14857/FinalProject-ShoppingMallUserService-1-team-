package com.example.frume.fragment.user_fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.frume.HomeActivity
import com.example.frume.R
import com.example.frume.UserActivity
import com.example.frume.databinding.FragmentUserSignUpBinding


class UserSignUpFragment : Fragment() {

    lateinit var userSignUpBinding: FragmentUserSignUpBinding
    lateinit var userActivity: UserActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        userActivity = activity as UserActivity
        userSignUpBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_user_sign_up,container,false)

        onClickSignUpButton()

        return userSignUpBinding.root
    }

    // 회원 가입 완료 및 홈화면으로 이동시키는 메서드
    fun onClickSignUpButton() {
        userSignUpBinding.buttonUserLogin.setOnClickListener {

            // UserActivity를 실행하고 현재 Activity를 종료한다.
            val homeIntent = Intent(userActivity, HomeActivity::class.java)
            startActivity(homeIntent)
            userActivity.finish()
        }
    }
}