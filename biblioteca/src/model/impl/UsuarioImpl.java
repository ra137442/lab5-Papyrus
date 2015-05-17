/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.Emprestimo;
import model.ModelPackage;
import model.Usuario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.UsuarioImpl#getEmprestimo <em>Emprestimo</em>}</li>
 *   <li>{@link model.impl.UsuarioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link model.impl.UsuarioImpl#getNumeroCadastro <em>Numero Cadastro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The cached value of the '{@link #getEmprestimo() <em>Emprestimo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected Emprestimo emprestimo;

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
	 * The default value of the '{@link #getNumeroCadastro() <em>Numero Cadastro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroCadastro()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_CADASTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumeroCadastro() <em>Numero Cadastro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroCadastro()
	 * @generated
	 * @ordered
	 */
	protected int numeroCadastro = NUMERO_CADASTRO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo getEmprestimo() {
		if (emprestimo != null && emprestimo.eIsProxy()) {
			InternalEObject oldEmprestimo = (InternalEObject)emprestimo;
			emprestimo = (Emprestimo)eResolveProxy(oldEmprestimo);
			if (emprestimo != oldEmprestimo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.USUARIO__EMPRESTIMO, oldEmprestimo, emprestimo));
			}
		}
		return emprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo basicGetEmprestimo() {
		return emprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmprestimo(Emprestimo newEmprestimo) {
		Emprestimo oldEmprestimo = emprestimo;
		emprestimo = newEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__EMPRESTIMO, oldEmprestimo, emprestimo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroCadastro() {
		return numeroCadastro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroCadastro(int newNumeroCadastro) {
		int oldNumeroCadastro = numeroCadastro;
		numeroCadastro = newNumeroCadastro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NUMERO_CADASTRO, oldNumeroCadastro, numeroCadastro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void FazReserva() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CancelaReserva() {
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
			case ModelPackage.USUARIO__EMPRESTIMO:
				if (resolve) return getEmprestimo();
				return basicGetEmprestimo();
			case ModelPackage.USUARIO__NOME:
				return getNome();
			case ModelPackage.USUARIO__NUMERO_CADASTRO:
				return getNumeroCadastro();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.USUARIO__EMPRESTIMO:
				setEmprestimo((Emprestimo)newValue);
				return;
			case ModelPackage.USUARIO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.USUARIO__NUMERO_CADASTRO:
				setNumeroCadastro((Integer)newValue);
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
			case ModelPackage.USUARIO__EMPRESTIMO:
				setEmprestimo((Emprestimo)null);
				return;
			case ModelPackage.USUARIO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__NUMERO_CADASTRO:
				setNumeroCadastro(NUMERO_CADASTRO_EDEFAULT);
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
			case ModelPackage.USUARIO__EMPRESTIMO:
				return emprestimo != null;
			case ModelPackage.USUARIO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.USUARIO__NUMERO_CADASTRO:
				return numeroCadastro != NUMERO_CADASTRO_EDEFAULT;
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
			case ModelPackage.USUARIO___FAZ_RESERVA:
				FazReserva();
				return null;
			case ModelPackage.USUARIO___CANCELA_RESERVA:
				CancelaReserva();
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
		result.append(", NumeroCadastro: ");
		result.append(numeroCadastro);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
