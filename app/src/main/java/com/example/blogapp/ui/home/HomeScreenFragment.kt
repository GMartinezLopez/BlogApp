package com.example.blogapp.ui.home

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.blogapp.R
import com.example.blogapp.data.model.Post
import com.example.blogapp.databinding.FragmentHomeScreenBinding
import com.example.blogapp.ui.home.adapter.HomeScreenAdapter
import com.google.firebase.Timestamp

class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeScreenBinding.bind(view)
        val postList = listOf(Post("https://tse2.mm.bing.net/th/id/OIP.TDTNaTcRv_p8SxiSt4x8qgHaHa?rs=1&pid=ImgDetMain", "Maximiliano Gómez",
            Timestamp.now(),"https://tse3.mm.bing.net/th/id/OIP.61OwniIOWBhB40ochQgo3QHaHa?w=180&h=180&c=7&r=0&o=5&pid=1.7"),
            )
        binding.rvHome.adapter=HomeScreenAdapter(postList)
    }


}