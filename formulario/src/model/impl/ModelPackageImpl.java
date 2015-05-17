/**
 */
package model.impl;

import model.Formulario;
import model.ModelFactory;
import model.ModelPackage;
import model.TrataErro;
import model.Usu�rio;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formularioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trataErroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usu�rioEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulario() {
		return formularioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulario_TrataErro() {
		return (EReference)formularioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Titulo() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Nome() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Sobrenome() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Cep() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Cpf() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Endereco() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Email() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Phone() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormulario__VerificaCPF() {
		return formularioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormulario__VerificaCEP() {
		return formularioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormulario__VerificaCamposObrigatorios() {
		return formularioEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormulario__InformaErro() {
		return formularioEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormulario__EnviaFormulario() {
		return formularioEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrataErro() {
		return trataErroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrataErro_CodigoErro() {
		return (EAttribute)trataErroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrataErro__MostraMensagem() {
		return trataErroEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsu�rio() {
		return usu�rioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsu�rio_Formulario() {
		return (EReference)usu�rioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Nome() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Email() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Endereco() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Cep() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Titulo() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Sobrenome() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Cpf() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsu�rio_Phone() {
		return (EAttribute)usu�rioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsu�rio__PreencheFormulario() {
		return usu�rioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		formularioEClass = createEClass(FORMULARIO);
		createEReference(formularioEClass, FORMULARIO__TRATA_ERRO);
		createEAttribute(formularioEClass, FORMULARIO__TITULO);
		createEAttribute(formularioEClass, FORMULARIO__NOME);
		createEAttribute(formularioEClass, FORMULARIO__SOBRENOME);
		createEAttribute(formularioEClass, FORMULARIO__CEP);
		createEAttribute(formularioEClass, FORMULARIO__CPF);
		createEAttribute(formularioEClass, FORMULARIO__ENDERECO);
		createEAttribute(formularioEClass, FORMULARIO__EMAIL);
		createEAttribute(formularioEClass, FORMULARIO__PHONE);
		createEOperation(formularioEClass, FORMULARIO___VERIFICA_CPF);
		createEOperation(formularioEClass, FORMULARIO___VERIFICA_CEP);
		createEOperation(formularioEClass, FORMULARIO___VERIFICA_CAMPOS_OBRIGATORIOS);
		createEOperation(formularioEClass, FORMULARIO___INFORMA_ERRO);
		createEOperation(formularioEClass, FORMULARIO___ENVIA_FORMULARIO);

		trataErroEClass = createEClass(TRATA_ERRO);
		createEAttribute(trataErroEClass, TRATA_ERRO__CODIGO_ERRO);
		createEOperation(trataErroEClass, TRATA_ERRO___MOSTRA_MENSAGEM);

		usu�rioEClass = createEClass(USU�RIO);
		createEReference(usu�rioEClass, USU�RIO__FORMULARIO);
		createEAttribute(usu�rioEClass, USU�RIO__NOME);
		createEAttribute(usu�rioEClass, USU�RIO__EMAIL);
		createEAttribute(usu�rioEClass, USU�RIO__ENDERECO);
		createEAttribute(usu�rioEClass, USU�RIO__CEP);
		createEAttribute(usu�rioEClass, USU�RIO__TITULO);
		createEAttribute(usu�rioEClass, USU�RIO__SOBRENOME);
		createEAttribute(usu�rioEClass, USU�RIO__CPF);
		createEAttribute(usu�rioEClass, USU�RIO__PHONE);
		createEOperation(usu�rioEClass, USU�RIO___PREENCHE_FORMULARIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(formularioEClass, Formulario.class, "Formulario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulario_TrataErro(), this.getTrataErro(), null, "trataErro", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulario_Titulo(), ecorePackage.getEString(), "Titulo", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulario_Nome(), ecorePackage.getEString(), "Nome", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulario_Sobrenome(), ecorePackage.getEString(), "Sobrenome", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulario_Cep(), ecorePackage.getEString(), "cep", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulario_Cpf(), ecorePackage.getEString(), "cpf", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulario_Endereco(), ecorePackage.getEString(), "endereco", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulario_Email(), ecorePackage.getEString(), "email", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFormulario_Phone(), ecorePackage.getEString(), "phone", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getFormulario__VerificaCPF(), null, "VerificaCPF", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getFormulario__VerificaCEP(), null, "VerificaCEP", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getFormulario__VerificaCamposObrigatorios(), null, "VerificaCamposObrigatorios", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getFormulario__InformaErro(), null, "InformaErro", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getFormulario__EnviaFormulario(), null, "EnviaFormulario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(trataErroEClass, TrataErro.class, "TrataErro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrataErro_CodigoErro(), ecorePackage.getEInt(), "CodigoErro", null, 1, 1, TrataErro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTrataErro__MostraMensagem(), null, "MostraMensagem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(usu�rioEClass, Usu�rio.class, "Usu�rio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsu�rio_Formulario(), this.getFormulario(), null, "formulario", null, 1, -1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Nome(), ecorePackage.getEString(), "Nome", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Email(), ecorePackage.getEString(), "email", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Endereco(), ecorePackage.getEString(), "endereco", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Cep(), ecorePackage.getEString(), "cep", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Titulo(), ecorePackage.getEString(), "Titulo", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Sobrenome(), ecorePackage.getEString(), "Sobrenome", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Cpf(), ecorePackage.getEString(), "cpf", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsu�rio_Phone(), ecorePackage.getEString(), "phone", null, 1, 1, Usu�rio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUsu�rio__PreencheFormulario(), null, "PreencheFormulario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
