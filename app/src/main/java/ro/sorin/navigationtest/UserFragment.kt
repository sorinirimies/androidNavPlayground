package ro.sorin.navigationtest

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.user_fragment.tv_user_name

class UserFragment : Fragment() {

  companion object {
    fun newInstance() = UserFragment()
  }

  private lateinit var viewModel: UserViewModel

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.user_fragment, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
    // TODO: Use the ViewModel
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val name = arguments?.getString(PARAM_USER_NAME)
    tv_user_name.text = name
  }
}
