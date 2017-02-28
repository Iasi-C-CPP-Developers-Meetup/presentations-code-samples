package ro.meetup.cpp.dsl.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import ro.meetup.cpp.dsl.dbDsl.Meeting;
import ro.meetup.cpp.dsl.dbDsl.Model;
import ro.meetup.cpp.dsl.dbDsl.Person;
import ro.meetup.cpp.dsl.dbDsl.Presentation;

@SuppressWarnings("all")
public class DbDslGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _cppCode = this.toCppCode(((Model) _head));
    fsa.generateFile("DatabaseImporter.cpp", _cppCode);
    EList<EObject> _contents_1 = resource.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    CharSequence _hppCode = this.toHppCode(((Model) _head_1));
    fsa.generateFile("DatabaseImporter.hpp", _hppCode);
  }
  
  public CharSequence toHppCode(final Model m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class DatabaseImporter");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("void import();");
    _builder.newLine();
    _builder.append("};");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toCppCode(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"DatabaseImporter.hpp\"");
    _builder.newLine();
    _builder.append("#include <iostream>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("void DatabaseImporter::import()");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("std::cout << \"importing persons:\" << std::endl;");
    _builder.newLine();
    {
      EList<Person> _persons = model.getPersons();
      for(final Person p : _persons) {
        _builder.append("std::cout << \"   ");
        String _firstName = p.getFirstName();
        _builder.append(_firstName, "");
        _builder.append(" ");
        String _lastName = p.getLastName();
        _builder.append(_lastName, "");
        _builder.append(", address: ");
        String _address = p.getAddress();
        _builder.append(_address, "");
        _builder.append(", birthdate: ");
        String _birthDate = p.getBirthDate();
        _builder.append(_birthDate, "");
        _builder.append("\" << std::endl;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("std::cout << \"\\nimporting meetings:\" << std::endl;");
    _builder.newLine();
    {
      EList<Meeting> _meetings = model.getMeetings();
      for(final Meeting m : _meetings) {
        CharSequence _cppCode = this.toCppCode(m);
        _builder.append(_cppCode, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toCppCode(final Meeting m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("std::cout << \"   ");
    String _date = m.getDate();
    _builder.append(_date, "");
    _builder.append("\" << std::endl;");
    _builder.newLineIfNotEmpty();
    _builder.append("std::cout << \"      presentations:\" << std::endl;");
    _builder.newLine();
    {
      EList<Presentation> _presentations = m.getPresentations();
      for(final Presentation p : _presentations) {
        _builder.append("std::cout << \"         ");
        String _title = p.getTitle();
        _builder.append(_title, "");
        _builder.append(" by: \";");
        _builder.newLineIfNotEmpty();
        {
          EList<Person> _presenters = p.getPresenters();
          for(final Person pers : _presenters) {
            _builder.append("std::cout << \"");
            String _firstName = pers.getFirstName();
            _builder.append(_firstName, "");
            _builder.append(" ");
            String _lastName = pers.getLastName();
            _builder.append(_lastName, "");
            _builder.append(" ,\";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("std::cout << std::endl;");
        _builder.newLine();
      }
    }
    _builder.append("std::cout << \"      participants:\" << std::endl;");
    _builder.newLine();
    {
      EList<Person> _participants = m.getParticipants();
      for(final Person p_1 : _participants) {
        _builder.append("std::cout << \"         ");
        String _firstName_1 = p_1.getFirstName();
        _builder.append(_firstName_1, "");
        _builder.append(" ");
        String _lastName_1 = p_1.getLastName();
        _builder.append(_lastName_1, "");
        _builder.append(" \" << std::endl;");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
