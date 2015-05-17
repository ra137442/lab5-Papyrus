/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.Atendente;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atendente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.AtendenteImpl#getCadastro <em>Cadastro</em>}</li>
 *   <li>{@link model.impl.AtendenteImpl#getSetor <em>Setor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtendenteImpl extends UsuarioImpl implements Atendente {
	/**
	 * The default value of the '{@link #getCadastro() <em>Cadastro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadastro()
	 * @generated
	 * @ordered
	 */
	protected static final int CADASTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCadastro() <em>Cadastro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadastro()
	 * @generated
	 * @ordered
	 */
	protected int cadastro = CADASTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetor() <em>Setor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetor()
	 * @generated
	 * @ordered
	 */
	protected static final String SETOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetor() <em>Setor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetor()
	 * @generated
	 * @ordered
	 */
	protected String setor = SETOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtendenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ATENDENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCadastro() {
		return cadastro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCadastro(int newCadastro) {
		int oldCadastro = cadastro;
		cadastro = newCadastro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATENDENTE__CADASTRO, oldCadastro, cadastro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetor() {
		return setor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetor(String newSetor) {
		String oldSetor = setor;
		setor = newSetor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATENDENTE__SETOR, oldSetor, setor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void IncluirExemplares() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ExcluirExemplares() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AtualizarDados() {
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
			case ModelPackage.ATENDENTE__CADASTRO:
				return getCadastro();
			case ModelPackage.ATENDENTE__SETOR:
				return getSetor();
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
			case ModelPackage.ATENDENTE__CADASTRO:
				setCadastro((Integer)newValue);
				return;
			case ModelPackage.ATENDENTE__SETOR:
				setSetor((String)newValue);
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
			case ModelPackage.ATENDENTE__CADASTRO:
				setCadastro(CADASTRO_EDEFAULT);
				return;
			case ModelPackage.ATENDENTE__SETOR:
				setSetor(SETOR_EDEFAULT);
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
			case ModelPackage.ATENDENTE__CADASTRO:
				return cadastro != CADASTRO_EDEFAULT;
			case ModelPackage.ATENDENTE__SETOR:
				return SETOR_EDEFAULT == null ? setor != null : !SETOR_EDEFAULT.equals(setor);
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
			case ModelPackage.ATENDENTE___INCLUIR_EXEMPLARES:
				IncluirExemplares();
				return null;
			case ModelPackage.ATENDENTE___EXCLUIR_EXEMPLARES:
				ExcluirExemplares();
				return null;
			case ModelPackage.ATENDENTE___ATUALIZAR_DADOS:
				AtualizarDados();
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
		result.append(" (Cadastro: ");
		result.append(cadastro);
		result.append(", Setor: ");
		result.append(setor);
		result.append(')');
		return result.toString();
	}

} //AtendenteImpl
