package br.com.cast.android.aula2.widget;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import br.com.cast.android.aula2.R;
import br.com.cast.android.aula2.rest.entity.Gender;
import br.com.cast.android.aula2.rest.entity.User;

/**
 * Componente que representa o template de cada um dos usuários manipulados no {@link UserListAdapter}.
 * A annotation {@link EViewGroup} identifica que esta classe representa um elemnto de visão que pode agrupar outros, como é o caso do {@link LinearLayout}.
 * 
 * @author venilton.junior
 */
@EViewGroup(R.layout.user_item)
public class UserItemView extends LinearLayout {

	@ViewById
	TextView txtNomeCompleto;

	public UserItemView(Context context) {
		super(context);
	}

	/**
	 * Método responsável pela configuração do {@link TextView} txtNomeCompleto.<br>
	 * Ele é chamado antes do retorno do método getView da classe {@link UserListAdapter}.
	 * 
	 * @param usuario
	 */
	public void configurarItem(User usuario) {
		txtNomeCompleto.setText(usuario.getFirstName() + " " + usuario.getLastName());
		int icone = Gender.F.equals(usuario.getGender()) ? R.drawable.ic_user_female : R.drawable.ic_user_male;
		txtNomeCompleto.setCompoundDrawablesWithIntrinsicBounds(icone, 0, 0, 0);
	}
}
