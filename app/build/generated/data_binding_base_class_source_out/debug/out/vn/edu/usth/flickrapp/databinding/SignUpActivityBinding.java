// Generated by view binder compiler. Do not edit!
package vn.edu.usth.flickrapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.edu.usth.flickrapp.R;

public final class SignUpActivityBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView errorMessageBirthday;

  @NonNull
  public final TextView errorMessageEmail;

  @NonNull
  public final TextView errorMessageFirstName;

  @NonNull
  public final TextView errorMessageLastName;

  @NonNull
  public final TextView errorMessagePass;

  @NonNull
  public final TextView errorMessagePass1;

  @NonNull
  public final TextView errorMessagePass2;

  @NonNull
  public final Button login;

  @NonNull
  public final Button register;

  @NonNull
  public final TextInputEditText txtBirthDay;

  @NonNull
  public final TextInputEditText txtEmail;

  @NonNull
  public final TextInputEditText txtFirstName;

  @NonNull
  public final TextInputEditText txtLastName;

  @NonNull
  public final TextInputEditText txtPassword;

  @NonNull
  public final TextView validPass1;

  @NonNull
  public final TextView validPass2;

  private SignUpActivityBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView errorMessageBirthday, @NonNull TextView errorMessageEmail,
      @NonNull TextView errorMessageFirstName, @NonNull TextView errorMessageLastName,
      @NonNull TextView errorMessagePass, @NonNull TextView errorMessagePass1,
      @NonNull TextView errorMessagePass2, @NonNull Button login, @NonNull Button register,
      @NonNull TextInputEditText txtBirthDay, @NonNull TextInputEditText txtEmail,
      @NonNull TextInputEditText txtFirstName, @NonNull TextInputEditText txtLastName,
      @NonNull TextInputEditText txtPassword, @NonNull TextView validPass1,
      @NonNull TextView validPass2) {
    this.rootView = rootView;
    this.errorMessageBirthday = errorMessageBirthday;
    this.errorMessageEmail = errorMessageEmail;
    this.errorMessageFirstName = errorMessageFirstName;
    this.errorMessageLastName = errorMessageLastName;
    this.errorMessagePass = errorMessagePass;
    this.errorMessagePass1 = errorMessagePass1;
    this.errorMessagePass2 = errorMessagePass2;
    this.login = login;
    this.register = register;
    this.txtBirthDay = txtBirthDay;
    this.txtEmail = txtEmail;
    this.txtFirstName = txtFirstName;
    this.txtLastName = txtLastName;
    this.txtPassword = txtPassword;
    this.validPass1 = validPass1;
    this.validPass2 = validPass2;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SignUpActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SignUpActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.sign_up_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SignUpActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.errorMessageBirthday;
      TextView errorMessageBirthday = ViewBindings.findChildViewById(rootView, id);
      if (errorMessageBirthday == null) {
        break missingId;
      }

      id = R.id.errorMessageEmail;
      TextView errorMessageEmail = ViewBindings.findChildViewById(rootView, id);
      if (errorMessageEmail == null) {
        break missingId;
      }

      id = R.id.errorMessageFirstName;
      TextView errorMessageFirstName = ViewBindings.findChildViewById(rootView, id);
      if (errorMessageFirstName == null) {
        break missingId;
      }

      id = R.id.errorMessageLastName;
      TextView errorMessageLastName = ViewBindings.findChildViewById(rootView, id);
      if (errorMessageLastName == null) {
        break missingId;
      }

      id = R.id.errorMessagePass;
      TextView errorMessagePass = ViewBindings.findChildViewById(rootView, id);
      if (errorMessagePass == null) {
        break missingId;
      }

      id = R.id.errorMessagePass1;
      TextView errorMessagePass1 = ViewBindings.findChildViewById(rootView, id);
      if (errorMessagePass1 == null) {
        break missingId;
      }

      id = R.id.errorMessagePass2;
      TextView errorMessagePass2 = ViewBindings.findChildViewById(rootView, id);
      if (errorMessagePass2 == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.register;
      Button register = ViewBindings.findChildViewById(rootView, id);
      if (register == null) {
        break missingId;
      }

      id = R.id.txtBirthDay;
      TextInputEditText txtBirthDay = ViewBindings.findChildViewById(rootView, id);
      if (txtBirthDay == null) {
        break missingId;
      }

      id = R.id.txtEmail;
      TextInputEditText txtEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtEmail == null) {
        break missingId;
      }

      id = R.id.txtFirstName;
      TextInputEditText txtFirstName = ViewBindings.findChildViewById(rootView, id);
      if (txtFirstName == null) {
        break missingId;
      }

      id = R.id.txtLastName;
      TextInputEditText txtLastName = ViewBindings.findChildViewById(rootView, id);
      if (txtLastName == null) {
        break missingId;
      }

      id = R.id.txtPassword;
      TextInputEditText txtPassword = ViewBindings.findChildViewById(rootView, id);
      if (txtPassword == null) {
        break missingId;
      }

      id = R.id.validPass1;
      TextView validPass1 = ViewBindings.findChildViewById(rootView, id);
      if (validPass1 == null) {
        break missingId;
      }

      id = R.id.validPass2;
      TextView validPass2 = ViewBindings.findChildViewById(rootView, id);
      if (validPass2 == null) {
        break missingId;
      }

      return new SignUpActivityBinding((RelativeLayout) rootView, errorMessageBirthday,
          errorMessageEmail, errorMessageFirstName, errorMessageLastName, errorMessagePass,
          errorMessagePass1, errorMessagePass2, login, register, txtBirthDay, txtEmail,
          txtFirstName, txtLastName, txtPassword, validPass1, validPass2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
