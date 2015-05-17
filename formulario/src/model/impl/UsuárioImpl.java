/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.Formulario;
import model.ModelPackage;
import model.Usuário;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuário</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.UsuárioImpl#getFormulario <em>Formulario</em>}</li>
 *   <li>{@link model.impl.UsuárioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link model.impl.UsuárioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link model.impl.UsuárioImpl#getEndereco <em>Endereco</em>}</li>
 *   <li>{@link model.impl.UsuárioImpl#getCep <em>Cep</em>}</li>
 *   <li>{@link model.impl.UsuárioImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link model.impl.UsuárioImpl#getSobrenome <em>Sobrenome</em>}</li>
 *   <li>{@link model.impl.UsuárioImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link model.impl.UsuárioImpl#getPhone <em>Phone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuárioImpl extends MinimalEObjectImpl.Container implements Usuário {
	/**
	 * The cached value of the '{@link #getFormulario() <em>Formulario</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulario()
	 * @generated
	 * @ordered
	 */
	protected EList<Formulario> formulario;

	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco() <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco() <em>Endereco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco()
	 * @generated
	 * @ordered
	 */
	protected String endereco = ENDERECO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected static final String CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected String cep = CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSobrenome() <em>Sobrenome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSobrenome()
	 * @generated
	 * @ordered
	 */
	protected static final String SOBRENOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSobrenome() <em>Sobrenome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSobrenome()
	 * @generated
	 * @ordered
	 */
	protected String sobrenome = SOBRENOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final String CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected String cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuárioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUÁRIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formulario> getFormulario() {
		if (formulario == null) {
			formulario = new EObjectResolvingEList<Formulario>(Formulario.class, this, ModelPackage.USUÁRIO__FORMULARIO);
		}
		return formulario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUÁRIO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUÁRIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco(String newEndereco) {
		String oldEndereco = endereco;
		endereco = newEndereco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUÁRIO__ENDERECO, oldEndereco, endereco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCep(String newCep) {
		String oldCep = cep;
		cep = newCep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUÁRIO__CEP, oldCep, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUÁRIO__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSobrenome(String newSobrenome) {
		String oldSobrenome = sobrenome;
		sobrenome = newSobrenome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUÁRIO__SOBRENOME, oldSobrenome, sobrenome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(String newCpf) {
		String oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUÁRIO__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUÁRIO__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void PreencheFormulario() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USUÁRIO__FORMULARIO:
				return getFormulario();
			case ModelPackage.USUÁRIO__NOME:
				return getNome();
			case ModelPackage.USUÁRIO__EMAIL:
				return getEmail();
			case ModelPackage.USUÁRIO__ENDERECO:
				return getEndereco();
			case ModelPackage.USUÁRIO__CEP:
				return getCep();
			case ModelPackage.USUÁRIO__TITULO:
				return getTitulo();
			case ModelPackage.USUÁRIO__SOBRENOME:
				return getSobrenome();
			case ModelPackage.USUÁRIO__CPF:
				return getCpf();
			case ModelPackage.USUÁRIO__PHONE:
				return getPhone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.USUÁRIO__FORMULARIO:
				getFormulario().clear();
				getFormulario().addAll((Collection<? extends Formulario>)newValue);
				return;
			case ModelPackage.USUÁRIO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.USUÁRIO__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelPackage.USUÁRIO__ENDERECO:
				setEndereco((String)newValue);
				return;
			case ModelPackage.USUÁRIO__CEP:
				setCep((String)newValue);
				return;
			case ModelPackage.USUÁRIO__TITULO:
				setTitulo((String)newValue);
				return;
			case ModelPackage.USUÁRIO__SOBRENOME:
				setSobrenome((String)newValue);
				return;
			case ModelPackage.USUÁRIO__CPF:
				setCpf((String)newValue);
				return;
			case ModelPackage.USUÁRIO__PHONE:
				setPhone((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.USUÁRIO__FORMULARIO:
				getFormulario().clear();
				return;
			case ModelPackage.USUÁRIO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.USUÁRIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelPackage.USUÁRIO__ENDERECO:
				setEndereco(ENDERECO_EDEFAULT);
				return;
			case ModelPackage.USUÁRIO__CEP:
				setCep(CEP_EDEFAULT);
				return;
			case ModelPackage.USUÁRIO__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case ModelPackage.USUÁRIO__SOBRENOME:
				setSobrenome(SOBRENOME_EDEFAULT);
				return;
			case ModelPackage.USUÁRIO__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case ModelPackage.USUÁRIO__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.USUÁRIO__FORMULARIO:
				return formulario != null && !formulario.isEmpty();
			case ModelPackage.USUÁRIO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.USUÁRIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelPackage.USUÁRIO__ENDERECO:
				return ENDERECO_EDEFAULT == null ? endereco != null : !ENDERECO_EDEFAULT.equals(endereco);
			case ModelPackage.USUÁRIO__CEP:
				return CEP_EDEFAULT == null ? cep != null : !CEP_EDEFAULT.equals(cep);
			case ModelPackage.USUÁRIO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case ModelPackage.USUÁRIO__SOBRENOME:
				return SOBRENOME_EDEFAULT == null ? sobrenome != null : !SOBRENOME_EDEFAULT.equals(sobrenome);
			case ModelPackage.USUÁRIO__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case ModelPackage.USUÁRIO__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.USUÁRIO___PREENCHE_FORMULARIO:
				PreencheFormulario();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Nome: ");
		result.append(nome);
		result.append(", email: ");
		result.append(email);
		result.append(", endereco: ");
		result.append(endereco);
		result.append(", cep: ");
		result.append(cep);
		result.append(", Titulo: ");
		result.append(titulo);
		result.append(", Sobrenome: ");
		result.append(sobrenome);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(", phone: ");
		result.append(phone);
		result.append(')');
		return result.toString();
	}

} //UsuárioImpl
