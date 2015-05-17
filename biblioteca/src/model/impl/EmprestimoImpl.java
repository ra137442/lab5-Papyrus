/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.Biblioteca;
import model.Emprestimo;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.EmprestimoImpl#getBiblioteca <em>Biblioteca</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmprestimoImpl extends MinimalEObjectImpl.Container implements Emprestimo {
	/**
	 * The cached value of the '{@link #getBiblioteca() <em>Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected Biblioteca biblioteca;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmprestimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPRESTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biblioteca getBiblioteca() {
		if (biblioteca != null && biblioteca.eIsProxy()) {
			InternalEObject oldBiblioteca = (InternalEObject)biblioteca;
			biblioteca = (Biblioteca)eResolveProxy(oldBiblioteca);
			if (biblioteca != oldBiblioteca) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EMPRESTIMO__BIBLIOTECA, oldBiblioteca, biblioteca));
			}
		}
		return biblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biblioteca basicGetBiblioteca() {
		return biblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiblioteca(Biblioteca newBiblioteca) {
		Biblioteca oldBiblioteca = biblioteca;
		biblioteca = newBiblioteca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__BIBLIOTECA, oldBiblioteca, biblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SolicitaEmprestimo() {
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
			case ModelPackage.EMPRESTIMO__BIBLIOTECA:
				if (resolve) return getBiblioteca();
				return basicGetBiblioteca();
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
			case ModelPackage.EMPRESTIMO__BIBLIOTECA:
				setBiblioteca((Biblioteca)newValue);
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
			case ModelPackage.EMPRESTIMO__BIBLIOTECA:
				setBiblioteca((Biblioteca)null);
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
			case ModelPackage.EMPRESTIMO__BIBLIOTECA:
				return biblioteca != null;
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
			case ModelPackage.EMPRESTIMO___SOLICITA_EMPRESTIMO:
				SolicitaEmprestimo();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EmprestimoImpl
