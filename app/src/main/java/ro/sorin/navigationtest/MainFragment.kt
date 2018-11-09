package ro.sorin.navigationtest

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.main_fragment.btn_settings
import kotlinx.android.synthetic.main.main_fragment.btn_user

const val PARAM_USER_NAME = "param-user-name"

class MainFragment : Fragment() {

  companion object {
    fun newInstance() = MainFragment()
  }

  private lateinit var viewModel: MainViewModel

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.main_fragment, container, false)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    // TODO: Use the ViewModel
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    btn_user.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_userFragment,
        Bundle().apply { putString(PARAM_USER_NAME, "Sorin") }))
    btn_settings.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_settingsFragment))
  }

}
