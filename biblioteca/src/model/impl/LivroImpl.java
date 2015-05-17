/**
 */
package model.impl;

import model.Livro;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Livro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.LivroImpl#getISBN <em>ISBN</em>}</li>
 *   <li>{@link model.impl.LivroImpl#getEdicao <em>Edicao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivroImpl extends PublicacaoImpl implements Livro {
	/**
	 * The default value of the '{@link #getISBN() <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISBN()
	 * @generated
	 * @ordered
	 */
	protected static final int ISBN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getISBN() <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISBN()
	 * @generated
	 * @ordered
	 */
	protected int isbn = ISBN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdicao() <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdicao()
	 * @generated
	 * @ordered
	 */
	protected static final int EDICAO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEdicao() <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdicao()
	 * @generated
	 * @ordered
	 */
	protected int edicao = EDICAO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LIVRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getISBN() {
		return isbn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISBN(int newISBN) {
		int oldISBN = isbn;
		isbn = newISBN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__ISBN, oldISBN, isbn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEdicao() {
		return edicao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdicao(int newEdicao) {
		int oldEdicao = edicao;
		edicao = newEdicao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__EDICAO, oldEdicao, edicao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.LIVRO__ISBN:
				return getISBN();
			case ModelPackage.LIVRO__EDICAO:
				return getEdicao();
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
			case ModelPackage.LIVRO__ISBN:
				setISBN((Integer)newValue);
				return;
			case ModelPackage.LIVRO__EDICAO:
				setEdicao((Integer)newValue);
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
			case ModelPackage.LIVRO__ISBN:
				setISBN(ISBN_EDEFAULT);
				return;
			case ModelPackage.LIVRO__EDICAO:
				setEdicao(EDICAO_EDEFAULT);
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
			case ModelPackage.LIVRO__ISBN:
				return isbn != ISBN_EDEFAULT;
			case ModelPackage.LIVRO__EDICAO:
				return edicao != EDICAO_EDEFAULT;
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
		result.append(" (ISBN: ");
		result.append(isbn);
		result.append(", Edicao: ");
		result.append(edicao);
		result.append(')');
		return result.toString();
	}

} //LivroImpl
