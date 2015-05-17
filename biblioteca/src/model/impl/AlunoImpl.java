/**
 */
package model.impl;

import model.Aluno;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.AlunoImpl#getRA <em>RA</em>}</li>
 *   <li>{@link model.impl.AlunoImpl#getCurso <em>Curso</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlunoImpl extends UsuarioImpl implements Aluno {
	/**
	 * The default value of the '{@link #getRA() <em>RA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRA()
	 * @generated
	 * @ordered
	 */
	protected static final int RA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRA() <em>RA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRA()
	 * @generated
	 * @ordered
	 */
	protected int ra = RA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurso() <em>Curso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurso()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurso() <em>Curso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurso()
	 * @generated
	 * @ordered
	 */
	protected String curso = CURSO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlunoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALUNO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRA() {
		return ra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRA(int newRA) {
		int oldRA = ra;
		ra = newRA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__RA, oldRA, ra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurso(String newCurso) {
		String oldCurso = curso;
		curso = newCurso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__CURSO, oldCurso, curso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALUNO__RA:
				return getRA();
			case ModelPackage.ALUNO__CURSO:
				return getCurso();
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
			case ModelPackage.ALUNO__RA:
				setRA((Integer)newValue);
				return;
			case ModelPackage.ALUNO__CURSO:
				setCurso((String)newValue);
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
			case ModelPackage.ALUNO__RA:
				setRA(RA_EDEFAULT);
				return;
			case ModelPackage.ALUNO__CURSO:
				setCurso(CURSO_EDEFAULT);
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
			case ModelPackage.ALUNO__RA:
				return ra != RA_EDEFAULT;
			case ModelPackage.ALUNO__CURSO:
				return CURSO_EDEFAULT == null ? curso != null : !CURSO_EDEFAULT.equals(curso);
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
		result.append(" (RA: ");
		result.append(ra);
		result.append(", Curso: ");
		result.append(curso);
		result.append(')');
		return result.toString();
	}

} //AlunoImpl
