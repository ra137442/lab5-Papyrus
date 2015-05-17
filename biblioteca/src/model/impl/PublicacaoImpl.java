/**
 */
package model.impl;

import model.Biblioteca;
import model.ModelPackage;
import model.Publicacao;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.PublicacaoImpl#getBiblioteca <em>Biblioteca</em>}</li>
 *   <li>{@link model.impl.PublicacaoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link model.impl.PublicacaoImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link model.impl.PublicacaoImpl#getArea <em>Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicacaoImpl extends MinimalEObjectImpl.Container implements Publicacao {
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
	 * The default value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected String autor = AUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PUBLICACAO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PUBLICACAO__BIBLIOTECA, oldBiblioteca, biblioteca));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__BIBLIOTECA, oldBiblioteca, biblioteca));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutor(String newAutor) {
		String oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__AUTOR, oldAutor, autor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PUBLICACAO__BIBLIOTECA:
				if (resolve) return getBiblioteca();
				return basicGetBiblioteca();
			case ModelPackage.PUBLICACAO__NOME:
				return getNome();
			case ModelPackage.PUBLICACAO__AUTOR:
				return getAutor();
			case ModelPackage.PUBLICACAO__AREA:
				return getArea();
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
			case ModelPackage.PUBLICACAO__BIBLIOTECA:
				setBiblioteca((Biblioteca)newValue);
				return;
			case ModelPackage.PUBLICACAO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.PUBLICACAO__AUTOR:
				setAutor((String)newValue);
				return;
			case ModelPackage.PUBLICACAO__AREA:
				setArea((String)newValue);
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
			case ModelPackage.PUBLICACAO__BIBLIOTECA:
				setBiblioteca((Biblioteca)null);
				return;
			case ModelPackage.PUBLICACAO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__AUTOR:
				setAutor(AUTOR_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__AREA:
				setArea(AREA_EDEFAULT);
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
			case ModelPackage.PUBLICACAO__BIBLIOTECA:
				return biblioteca != null;
			case ModelPackage.PUBLICACAO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.PUBLICACAO__AUTOR:
				return AUTOR_EDEFAULT == null ? autor != null : !AUTOR_EDEFAULT.equals(autor);
			case ModelPackage.PUBLICACAO__AREA:
				return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
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
		result.append(" (Nome: ");
		result.append(nome);
		result.append(", Autor: ");
		result.append(autor);
		result.append(", Area: ");
		result.append(area);
		result.append(')');
		return result.toString();
	}

} //PublicacaoImpl
