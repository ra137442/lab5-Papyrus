/**
 */
package model.impl;

import model.Biblioteca;
import model.Exemplar;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.ExemplarImpl#getBiblioteca <em>Biblioteca</em>}</li>
 *   <li>{@link model.impl.ExemplarImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link model.impl.ExemplarImpl#getPeriodoEmprestimo <em>Periodo Emprestimo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodoEmprestimo() <em>Periodo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodoEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIODO_EMPRESTIMO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriodoEmprestimo() <em>Periodo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodoEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected int periodoEmprestimo = PERIODO_EMPRESTIMO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXEMPLAR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXEMPLAR__BIBLIOTECA, oldBiblioteca, biblioteca));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__BIBLIOTECA, oldBiblioteca, biblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriodoEmprestimo() {
		return periodoEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodoEmprestimo(int newPeriodoEmprestimo) {
		int oldPeriodoEmprestimo = periodoEmprestimo;
		periodoEmprestimo = newPeriodoEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__PERIODO_EMPRESTIMO, oldPeriodoEmprestimo, periodoEmprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__BIBLIOTECA:
				if (resolve) return getBiblioteca();
				return basicGetBiblioteca();
			case ModelPackage.EXEMPLAR__STATUS:
				return getStatus();
			case ModelPackage.EXEMPLAR__PERIODO_EMPRESTIMO:
				return getPeriodoEmprestimo();
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
			case ModelPackage.EXEMPLAR__BIBLIOTECA:
				setBiblioteca((Biblioteca)newValue);
				return;
			case ModelPackage.EXEMPLAR__STATUS:
				setStatus((String)newValue);
				return;
			case ModelPackage.EXEMPLAR__PERIODO_EMPRESTIMO:
				setPeriodoEmprestimo((Integer)newValue);
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
			case ModelPackage.EXEMPLAR__BIBLIOTECA:
				setBiblioteca((Biblioteca)null);
				return;
			case ModelPackage.EXEMPLAR__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__PERIODO_EMPRESTIMO:
				setPeriodoEmprestimo(PERIODO_EMPRESTIMO_EDEFAULT);
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
			case ModelPackage.EXEMPLAR__BIBLIOTECA:
				return biblioteca != null;
			case ModelPackage.EXEMPLAR__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case ModelPackage.EXEMPLAR__PERIODO_EMPRESTIMO:
				return periodoEmprestimo != PERIODO_EMPRESTIMO_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (Status: ");
		result.append(status);
		result.append(", PeriodoEmprestimo: ");
		result.append(periodoEmprestimo);
		result.append(')');
		return result.toString();
	}

} //ExemplarImpl
