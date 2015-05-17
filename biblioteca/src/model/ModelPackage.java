/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TerminalImpl
	 * @see model.impl.ModelPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 0;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__BIBLIOTECA = 0;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Mostra Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL___MOSTRA_INFO = 0;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BibliotecaImpl
	 * @see model.impl.ModelPackageImpl#getBiblioteca()
	 * @generated
	 */
	int BIBLIOTECA = 1;

	/**
	 * The number of structural features of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Verifica Atraso</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA___VERIFICA_ATRASO = 0;

	/**
	 * The operation id for the '<em>Faz Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA___FAZ_EMPRESTIMO = 1;

	/**
	 * The operation id for the '<em>Calcula Multa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA___CALCULA_MULTA = 2;

	/**
	 * The operation id for the '<em>Cadastra Usuario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA___CADASTRA_USUARIO = 3;

	/**
	 * The number of operations of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link model.impl.PublicacaoImpl <em>Publicacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PublicacaoImpl
	 * @see model.impl.ModelPackageImpl#getPublicacao()
	 * @generated
	 */
	int PUBLICACAO = 3;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__BIBLIOTECA = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__AUTOR = 2;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__AREA = 3;

	/**
	 * The number of structural features of the '<em>Publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LivroImpl <em>Livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LivroImpl
	 * @see model.impl.ModelPackageImpl#getLivro()
	 * @generated
	 */
	int LIVRO = 2;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__BIBLIOTECA = PUBLICACAO__BIBLIOTECA;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__NOME = PUBLICACAO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AREA = PUBLICACAO__AREA;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__ISBN = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__EDICAO = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ExemplarImpl
	 * @see model.impl.ModelPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 4;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__BIBLIOTECA = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Periodo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__PERIODO_EMPRESTIMO = 2;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.PeriodicoImpl <em>Periodico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PeriodicoImpl
	 * @see model.impl.ModelPackageImpl#getPeriodico()
	 * @generated
	 */
	int PERIODICO = 5;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__BIBLIOTECA = PUBLICACAO__BIBLIOTECA;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__NOME = PUBLICACAO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__AREA = PUBLICACAO__AREA;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__DATA = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.TeseImpl <em>Tese</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TeseImpl
	 * @see model.impl.ModelPackageImpl#getTese()
	 * @generated
	 */
	int TESE = 6;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__BIBLIOTECA = PUBLICACAO__BIBLIOTECA;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__NOME = PUBLICACAO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__AREA = PUBLICACAO__AREA;

	/**
	 * The feature id for the '<em><b>Orientador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__ORIENTADOR = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ManualImpl
	 * @see model.impl.ModelPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 7;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__BIBLIOTECA = PUBLICACAO__BIBLIOTECA;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__NOME = PUBLICACAO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__AREA = PUBLICACAO__AREA;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.UsuarioImpl
	 * @see model.impl.ModelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 8;

	/**
	 * The feature id for the '<em><b>Emprestimo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMPRESTIMO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Numero Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NUMERO_CADASTRO = 2;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Faz Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___FAZ_RESERVA = 0;

	/**
	 * The operation id for the '<em>Cancela Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___CANCELA_RESERVA = 1;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.EmprestimoImpl <em>Emprestimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EmprestimoImpl
	 * @see model.impl.ModelPackageImpl#getEmprestimo()
	 * @generated
	 */
	int EMPRESTIMO = 9;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__BIBLIOTECA = 0;

	/**
	 * The number of structural features of the '<em>Emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Solicita Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO___SOLICITA_EMPRESTIMO = 0;

	/**
	 * The number of operations of the '<em>Emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AlunoImpl
	 * @see model.impl.ModelPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 10;

	/**
	 * The feature id for the '<em><b>Emprestimo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__EMPRESTIMO = USUARIO__EMPRESTIMO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Numero Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NUMERO_CADASTRO = USUARIO__NUMERO_CADASTRO;

	/**
	 * The feature id for the '<em><b>RA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__RA = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Curso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CURSO = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Faz Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___FAZ_RESERVA = USUARIO___FAZ_RESERVA;

	/**
	 * The operation id for the '<em>Cancela Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___CANCELA_RESERVA = USUARIO___CANCELA_RESERVA;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProfessorImpl
	 * @see model.impl.ModelPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 11;

	/**
	 * The feature id for the '<em><b>Emprestimo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMPRESTIMO = USUARIO__EMPRESTIMO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Numero Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NUMERO_CADASTRO = USUARIO__NUMERO_CADASTRO;

	/**
	 * The feature id for the '<em><b>Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__DEPARTAMENTO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Faz Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___FAZ_RESERVA = USUARIO___FAZ_RESERVA;

	/**
	 * The operation id for the '<em>Cancela Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___CANCELA_RESERVA = USUARIO___CANCELA_RESERVA;

	/**
	 * The operation id for the '<em>Bloquear Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___BLOQUEAR_EXEMPLAR = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desbloquear Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DESBLOQUEAR_EXEMPLAR = USUARIO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link model.impl.AtendenteImpl <em>Atendente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AtendenteImpl
	 * @see model.impl.ModelPackageImpl#getAtendente()
	 * @generated
	 */
	int ATENDENTE = 12;

	/**
	 * The feature id for the '<em><b>Emprestimo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__EMPRESTIMO = USUARIO__EMPRESTIMO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Numero Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__NUMERO_CADASTRO = USUARIO__NUMERO_CADASTRO;

	/**
	 * The feature id for the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__CADASTRO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Setor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE__SETOR = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Faz Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___FAZ_RESERVA = USUARIO___FAZ_RESERVA;

	/**
	 * The operation id for the '<em>Cancela Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___CANCELA_RESERVA = USUARIO___CANCELA_RESERVA;

	/**
	 * The operation id for the '<em>Incluir Exemplares</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___INCLUIR_EXEMPLARES = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Excluir Exemplares</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___EXCLUIR_EXEMPLARES = USUARIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Atualizar Dados</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE___ATUALIZAR_DADOS = USUARIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Atendente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATENDENTE_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FuncionarioImpl
	 * @see model.impl.ModelPackageImpl#getFuncionario()
	 * @generated
	 */
	int FUNCIONARIO = 13;

	/**
	 * The feature id for the '<em><b>Emprestimo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__EMPRESTIMO = USUARIO__EMPRESTIMO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Numero Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__NUMERO_CADASTRO = USUARIO__NUMERO_CADASTRO;

	/**
	 * The feature id for the '<em><b>Funcao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__FUNCAO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Faz Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___FAZ_RESERVA = USUARIO___FAZ_RESERVA;

	/**
	 * The operation id for the '<em>Cancela Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___CANCELA_RESERVA = USUARIO___CANCELA_RESERVA;

	/**
	 * The number of operations of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.TCCImpl <em>TCC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TCCImpl
	 * @see model.impl.ModelPackageImpl#getTCC()
	 * @generated
	 */
	int TCC = 14;

	/**
	 * The feature id for the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCC__BIBLIOTECA = PUBLICACAO__BIBLIOTECA;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCC__NOME = PUBLICACAO__NOME;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCC__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCC__AREA = PUBLICACAO__AREA;

	/**
	 * The number of structural features of the '<em>TCC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCC_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCC_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see model.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the reference '{@link model.Terminal#getBiblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Biblioteca</em>'.
	 * @see model.Terminal#getBiblioteca()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Biblioteca();

	/**
	 * Returns the meta object for the '{@link model.Terminal#MostraInfo() <em>Mostra Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mostra Info</em>' operation.
	 * @see model.Terminal#MostraInfo()
	 * @generated
	 */
	EOperation getTerminal__MostraInfo();

	/**
	 * Returns the meta object for class '{@link model.Biblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biblioteca</em>'.
	 * @see model.Biblioteca
	 * @generated
	 */
	EClass getBiblioteca();

	/**
	 * Returns the meta object for the '{@link model.Biblioteca#VerificaAtraso() <em>Verifica Atraso</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verifica Atraso</em>' operation.
	 * @see model.Biblioteca#VerificaAtraso()
	 * @generated
	 */
	EOperation getBiblioteca__VerificaAtraso();

	/**
	 * Returns the meta object for the '{@link model.Biblioteca#FazEmprestimo() <em>Faz Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Faz Emprestimo</em>' operation.
	 * @see model.Biblioteca#FazEmprestimo()
	 * @generated
	 */
	EOperation getBiblioteca__FazEmprestimo();

	/**
	 * Returns the meta object for the '{@link model.Biblioteca#CalculaMulta() <em>Calcula Multa</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcula Multa</em>' operation.
	 * @see model.Biblioteca#CalculaMulta()
	 * @generated
	 */
	EOperation getBiblioteca__CalculaMulta();

	/**
	 * Returns the meta object for the '{@link model.Biblioteca#CadastraUsuario() <em>Cadastra Usuario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cadastra Usuario</em>' operation.
	 * @see model.Biblioteca#CadastraUsuario()
	 * @generated
	 */
	EOperation getBiblioteca__CadastraUsuario();

	/**
	 * Returns the meta object for class '{@link model.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livro</em>'.
	 * @see model.Livro
	 * @generated
	 */
	EClass getLivro();

	/**
	 * Returns the meta object for the attribute '{@link model.Livro#getISBN <em>ISBN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISBN</em>'.
	 * @see model.Livro#getISBN()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_ISBN();

	/**
	 * Returns the meta object for the attribute '{@link model.Livro#getEdicao <em>Edicao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edicao</em>'.
	 * @see model.Livro#getEdicao()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Edicao();

	/**
	 * Returns the meta object for class '{@link model.Publicacao <em>Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicacao</em>'.
	 * @see model.Publicacao
	 * @generated
	 */
	EClass getPublicacao();

	/**
	 * Returns the meta object for the reference '{@link model.Publicacao#getBiblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Biblioteca</em>'.
	 * @see model.Publicacao#getBiblioteca()
	 * @see #getPublicacao()
	 * @generated
	 */
	EReference getPublicacao_Biblioteca();

	/**
	 * Returns the meta object for the attribute '{@link model.Publicacao#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Publicacao#getNome()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Publicacao#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see model.Publicacao#getAutor()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Autor();

	/**
	 * Returns the meta object for the attribute '{@link model.Publicacao#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see model.Publicacao#getArea()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Area();

	/**
	 * Returns the meta object for class '{@link model.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see model.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for the reference '{@link model.Exemplar#getBiblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Biblioteca</em>'.
	 * @see model.Exemplar#getBiblioteca()
	 * @see #getExemplar()
	 * @generated
	 */
	EReference getExemplar_Biblioteca();

	/**
	 * Returns the meta object for the attribute '{@link model.Exemplar#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see model.Exemplar#getStatus()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Status();

	/**
	 * Returns the meta object for the attribute '{@link model.Exemplar#getPeriodoEmprestimo <em>Periodo Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodo Emprestimo</em>'.
	 * @see model.Exemplar#getPeriodoEmprestimo()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_PeriodoEmprestimo();

	/**
	 * Returns the meta object for class '{@link model.Periodico <em>Periodico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodico</em>'.
	 * @see model.Periodico
	 * @generated
	 */
	EClass getPeriodico();

	/**
	 * Returns the meta object for the attribute '{@link model.Periodico#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see model.Periodico#getData()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_Data();

	/**
	 * Returns the meta object for class '{@link model.Tese <em>Tese</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tese</em>'.
	 * @see model.Tese
	 * @generated
	 */
	EClass getTese();

	/**
	 * Returns the meta object for the attribute '{@link model.Tese#getOrientador <em>Orientador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientador</em>'.
	 * @see model.Tese#getOrientador()
	 * @see #getTese()
	 * @generated
	 */
	EAttribute getTese_Orientador();

	/**
	 * Returns the meta object for class '{@link model.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see model.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for class '{@link model.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see model.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the reference '{@link model.Usuario#getEmprestimo <em>Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emprestimo</em>'.
	 * @see model.Usuario#getEmprestimo()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Emprestimo();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuario#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Usuario#getNome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuario#getNumeroCadastro <em>Numero Cadastro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Cadastro</em>'.
	 * @see model.Usuario#getNumeroCadastro()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_NumeroCadastro();

	/**
	 * Returns the meta object for the '{@link model.Usuario#FazReserva() <em>Faz Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Faz Reserva</em>' operation.
	 * @see model.Usuario#FazReserva()
	 * @generated
	 */
	EOperation getUsuario__FazReserva();

	/**
	 * Returns the meta object for the '{@link model.Usuario#CancelaReserva() <em>Cancela Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancela Reserva</em>' operation.
	 * @see model.Usuario#CancelaReserva()
	 * @generated
	 */
	EOperation getUsuario__CancelaReserva();

	/**
	 * Returns the meta object for class '{@link model.Emprestimo <em>Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emprestimo</em>'.
	 * @see model.Emprestimo
	 * @generated
	 */
	EClass getEmprestimo();

	/**
	 * Returns the meta object for the reference '{@link model.Emprestimo#getBiblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Biblioteca</em>'.
	 * @see model.Emprestimo#getBiblioteca()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EReference getEmprestimo_Biblioteca();

	/**
	 * Returns the meta object for the '{@link model.Emprestimo#SolicitaEmprestimo() <em>Solicita Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solicita Emprestimo</em>' operation.
	 * @see model.Emprestimo#SolicitaEmprestimo()
	 * @generated
	 */
	EOperation getEmprestimo__SolicitaEmprestimo();

	/**
	 * Returns the meta object for class '{@link model.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see model.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for the attribute '{@link model.Aluno#getRA <em>RA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RA</em>'.
	 * @see model.Aluno#getRA()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_RA();

	/**
	 * Returns the meta object for the attribute '{@link model.Aluno#getCurso <em>Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curso</em>'.
	 * @see model.Aluno#getCurso()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_Curso();

	/**
	 * Returns the meta object for class '{@link model.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see model.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the attribute '{@link model.Professor#getDepartamento <em>Departamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departamento</em>'.
	 * @see model.Professor#getDepartamento()
	 * @see #getProfessor()
	 * @generated
	 */
	EAttribute getProfessor_Departamento();

	/**
	 * Returns the meta object for the '{@link model.Professor#BloquearExemplar() <em>Bloquear Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloquear Exemplar</em>' operation.
	 * @see model.Professor#BloquearExemplar()
	 * @generated
	 */
	EOperation getProfessor__BloquearExemplar();

	/**
	 * Returns the meta object for the '{@link model.Professor#DesbloquearExemplar() <em>Desbloquear Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desbloquear Exemplar</em>' operation.
	 * @see model.Professor#DesbloquearExemplar()
	 * @generated
	 */
	EOperation getProfessor__DesbloquearExemplar();

	/**
	 * Returns the meta object for class '{@link model.Atendente <em>Atendente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atendente</em>'.
	 * @see model.Atendente
	 * @generated
	 */
	EClass getAtendente();

	/**
	 * Returns the meta object for the attribute '{@link model.Atendente#getCadastro <em>Cadastro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cadastro</em>'.
	 * @see model.Atendente#getCadastro()
	 * @see #getAtendente()
	 * @generated
	 */
	EAttribute getAtendente_Cadastro();

	/**
	 * Returns the meta object for the attribute '{@link model.Atendente#getSetor <em>Setor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setor</em>'.
	 * @see model.Atendente#getSetor()
	 * @see #getAtendente()
	 * @generated
	 */
	EAttribute getAtendente_Setor();

	/**
	 * Returns the meta object for the '{@link model.Atendente#IncluirExemplares() <em>Incluir Exemplares</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incluir Exemplares</em>' operation.
	 * @see model.Atendente#IncluirExemplares()
	 * @generated
	 */
	EOperation getAtendente__IncluirExemplares();

	/**
	 * Returns the meta object for the '{@link model.Atendente#ExcluirExemplares() <em>Excluir Exemplares</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluir Exemplares</em>' operation.
	 * @see model.Atendente#ExcluirExemplares()
	 * @generated
	 */
	EOperation getAtendente__ExcluirExemplares();

	/**
	 * Returns the meta object for the '{@link model.Atendente#AtualizarDados() <em>Atualizar Dados</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizar Dados</em>' operation.
	 * @see model.Atendente#AtualizarDados()
	 * @generated
	 */
	EOperation getAtendente__AtualizarDados();

	/**
	 * Returns the meta object for class '{@link model.Funcionario <em>Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcionario</em>'.
	 * @see model.Funcionario
	 * @generated
	 */
	EClass getFuncionario();

	/**
	 * Returns the meta object for the attribute '{@link model.Funcionario#getFuncao <em>Funcao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funcao</em>'.
	 * @see model.Funcionario#getFuncao()
	 * @see #getFuncionario()
	 * @generated
	 */
	EAttribute getFuncionario_Funcao();

	/**
	 * Returns the meta object for class '{@link model.TCC <em>TCC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCC</em>'.
	 * @see model.TCC
	 * @generated
	 */
	EClass getTCC();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TerminalImpl
		 * @see model.impl.ModelPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__BIBLIOTECA = eINSTANCE.getTerminal_Biblioteca();

		/**
		 * The meta object literal for the '<em><b>Mostra Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERMINAL___MOSTRA_INFO = eINSTANCE.getTerminal__MostraInfo();

		/**
		 * The meta object literal for the '{@link model.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BibliotecaImpl
		 * @see model.impl.ModelPackageImpl#getBiblioteca()
		 * @generated
		 */
		EClass BIBLIOTECA = eINSTANCE.getBiblioteca();

		/**
		 * The meta object literal for the '<em><b>Verifica Atraso</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECA___VERIFICA_ATRASO = eINSTANCE.getBiblioteca__VerificaAtraso();

		/**
		 * The meta object literal for the '<em><b>Faz Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECA___FAZ_EMPRESTIMO = eINSTANCE.getBiblioteca__FazEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Calcula Multa</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECA___CALCULA_MULTA = eINSTANCE.getBiblioteca__CalculaMulta();

		/**
		 * The meta object literal for the '<em><b>Cadastra Usuario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECA___CADASTRA_USUARIO = eINSTANCE.getBiblioteca__CadastraUsuario();

		/**
		 * The meta object literal for the '{@link model.impl.LivroImpl <em>Livro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LivroImpl
		 * @see model.impl.ModelPackageImpl#getLivro()
		 * @generated
		 */
		EClass LIVRO = eINSTANCE.getLivro();

		/**
		 * The meta object literal for the '<em><b>ISBN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__ISBN = eINSTANCE.getLivro_ISBN();

		/**
		 * The meta object literal for the '<em><b>Edicao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__EDICAO = eINSTANCE.getLivro_Edicao();

		/**
		 * The meta object literal for the '{@link model.impl.PublicacaoImpl <em>Publicacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PublicacaoImpl
		 * @see model.impl.ModelPackageImpl#getPublicacao()
		 * @generated
		 */
		EClass PUBLICACAO = eINSTANCE.getPublicacao();

		/**
		 * The meta object literal for the '<em><b>Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICACAO__BIBLIOTECA = eINSTANCE.getPublicacao_Biblioteca();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__NOME = eINSTANCE.getPublicacao_Nome();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__AUTOR = eINSTANCE.getPublicacao_Autor();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__AREA = eINSTANCE.getPublicacao_Area();

		/**
		 * The meta object literal for the '{@link model.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ExemplarImpl
		 * @see model.impl.ModelPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '<em><b>Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEMPLAR__BIBLIOTECA = eINSTANCE.getExemplar_Biblioteca();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__STATUS = eINSTANCE.getExemplar_Status();

		/**
		 * The meta object literal for the '<em><b>Periodo Emprestimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__PERIODO_EMPRESTIMO = eINSTANCE.getExemplar_PeriodoEmprestimo();

		/**
		 * The meta object literal for the '{@link model.impl.PeriodicoImpl <em>Periodico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PeriodicoImpl
		 * @see model.impl.ModelPackageImpl#getPeriodico()
		 * @generated
		 */
		EClass PERIODICO = eINSTANCE.getPeriodico();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__DATA = eINSTANCE.getPeriodico_Data();

		/**
		 * The meta object literal for the '{@link model.impl.TeseImpl <em>Tese</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TeseImpl
		 * @see model.impl.ModelPackageImpl#getTese()
		 * @generated
		 */
		EClass TESE = eINSTANCE.getTese();

		/**
		 * The meta object literal for the '<em><b>Orientador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESE__ORIENTADOR = eINSTANCE.getTese_Orientador();

		/**
		 * The meta object literal for the '{@link model.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ManualImpl
		 * @see model.impl.ModelPackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '{@link model.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.UsuarioImpl
		 * @see model.impl.ModelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Emprestimo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__EMPRESTIMO = eINSTANCE.getUsuario_Emprestimo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOME = eINSTANCE.getUsuario_Nome();

		/**
		 * The meta object literal for the '<em><b>Numero Cadastro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NUMERO_CADASTRO = eINSTANCE.getUsuario_NumeroCadastro();

		/**
		 * The meta object literal for the '<em><b>Faz Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___FAZ_RESERVA = eINSTANCE.getUsuario__FazReserva();

		/**
		 * The meta object literal for the '<em><b>Cancela Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___CANCELA_RESERVA = eINSTANCE.getUsuario__CancelaReserva();

		/**
		 * The meta object literal for the '{@link model.impl.EmprestimoImpl <em>Emprestimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.EmprestimoImpl
		 * @see model.impl.ModelPackageImpl#getEmprestimo()
		 * @generated
		 */
		EClass EMPRESTIMO = eINSTANCE.getEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Biblioteca</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPRESTIMO__BIBLIOTECA = eINSTANCE.getEmprestimo_Biblioteca();

		/**
		 * The meta object literal for the '<em><b>Solicita Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMPRESTIMO___SOLICITA_EMPRESTIMO = eINSTANCE.getEmprestimo__SolicitaEmprestimo();

		/**
		 * The meta object literal for the '{@link model.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AlunoImpl
		 * @see model.impl.ModelPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '<em><b>RA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__RA = eINSTANCE.getAluno_RA();

		/**
		 * The meta object literal for the '<em><b>Curso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__CURSO = eINSTANCE.getAluno_Curso();

		/**
		 * The meta object literal for the '{@link model.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ProfessorImpl
		 * @see model.impl.ModelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Departamento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSOR__DEPARTAMENTO = eINSTANCE.getProfessor_Departamento();

		/**
		 * The meta object literal for the '<em><b>Bloquear Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___BLOQUEAR_EXEMPLAR = eINSTANCE.getProfessor__BloquearExemplar();

		/**
		 * The meta object literal for the '<em><b>Desbloquear Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___DESBLOQUEAR_EXEMPLAR = eINSTANCE.getProfessor__DesbloquearExemplar();

		/**
		 * The meta object literal for the '{@link model.impl.AtendenteImpl <em>Atendente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AtendenteImpl
		 * @see model.impl.ModelPackageImpl#getAtendente()
		 * @generated
		 */
		EClass ATENDENTE = eINSTANCE.getAtendente();

		/**
		 * The meta object literal for the '<em><b>Cadastro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATENDENTE__CADASTRO = eINSTANCE.getAtendente_Cadastro();

		/**
		 * The meta object literal for the '<em><b>Setor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATENDENTE__SETOR = eINSTANCE.getAtendente_Setor();

		/**
		 * The meta object literal for the '<em><b>Incluir Exemplares</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___INCLUIR_EXEMPLARES = eINSTANCE.getAtendente__IncluirExemplares();

		/**
		 * The meta object literal for the '<em><b>Excluir Exemplares</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___EXCLUIR_EXEMPLARES = eINSTANCE.getAtendente__ExcluirExemplares();

		/**
		 * The meta object literal for the '<em><b>Atualizar Dados</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATENDENTE___ATUALIZAR_DADOS = eINSTANCE.getAtendente__AtualizarDados();

		/**
		 * The meta object literal for the '{@link model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FuncionarioImpl
		 * @see model.impl.ModelPackageImpl#getFuncionario()
		 * @generated
		 */
		EClass FUNCIONARIO = eINSTANCE.getFuncionario();

		/**
		 * The meta object literal for the '<em><b>Funcao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__FUNCAO = eINSTANCE.getFuncionario_Funcao();

		/**
		 * The meta object literal for the '{@link model.impl.TCCImpl <em>TCC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TCCImpl
		 * @see model.impl.ModelPackageImpl#getTCC()
		 * @generated
		 */
		EClass TCC = eINSTANCE.getTCC();

	}

} //ModelPackage
