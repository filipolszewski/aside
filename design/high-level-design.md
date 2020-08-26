# Foreword

This document is not actually describing the real product for now. It is a mock up of documentation / potential high level design used by me as a brainstorming tool where I throw ideas in, note others on the side and come back here regularly to adjust first ideas.

# **Aside** - High Level Design

"Codebase documentation" sounds risky. Most of the experienced developers out there probably think that the best documentation for codebase is codebase itself. Good code is flexible, and additionally documenting good code it sounds like a redundant & boring waste of time...

**And that is true.** But it is true only for certain levels of abstraction - the lower ones. If there's a class with public API, perhaps the best documentation to that class is the set of tests written for that public API. **Aside does not change this.** The more clean and tested the 'unit' is on given level, there is less need for additional **Aside** document.

This is why **Aside** primarly focuses on higher level of abstraction - starting somewhere around a group of classes (i.e. package in Java), ideally even higher - on group of such groups (super-package or whole 'project' i.e. Maven module). Team of professionals can analyse and decide on their 'sweet spot' of abstraction being stable.

**Aside** might be an overkill for young, smaller projects, flexible projects, private projects, Proof Of Concept projects etc. It is designed for larger systems - where a single developer simply cannot grasp the whole codebase or it would take years to grasp it. It is designed for both newly created systems and aleady-legacy systems.

**Aside** is a tool for enterprise 'competence management' used & embraced by techical employees instead of less-technical managers. It is structured around the codebase, not around project management tools. It is focused on principles developers recognize, understand and appreciate like KISS & DRY.

**Aside does not** require additional work. Some kind of competence management is usually in place for every bigger system, but Aside provides a clear, simple platform for this proccess to happen **in the right place**. The desing is always there - big upfront, evolving iteratively or 'just happening as we go' - and Aside helps to keep in in place in developer friendly place.

_Design documentation_ aspect of Aside is the core idea, but the benefits of well organised & smart code documentation goes beyond just 'knowing what this thing does'. Aside provides additional (and optional!) tools for getting in way of the legacy chaos. First, perhaps most obvious benefit is the competence mapping possibility: the existing documentation can be analysed based on authors, time and completeness to provide insights into where your company's competences are and how are they distributed. Second example can be **the dictionary** feature, where concept explanations can be defined for parent node and be visible in all child nodes.

Depending on whether you believe in such project or not, you might feel like Aside is this one tool always missing in professional enterprise project, or another tool that takes a bite of your beautiful coding time. It can be both - like with most cool things, it's the way we use them that matters in the end.

# The Foundations

The simple way of thinking about Aside is a **graph of documents that resemble a tree** - in most scenarios. We have nodes that define modules with parent and children ones - parent being the higher abstraction and children being the 'submodules'. The parent/children relation is based on filesystem relation.

Basically, you write Markdown docs for each directory that matters to you. You can use some additional Aside features inside to enhance the documentation.

Configuration template describes how Aside should behave for given project (node and all its children nodes). If a children declares its own template, values have precedence over parent template, with the exception of enforced options and types.

Now, consider an example of first Aside setup done to a simple project. This example uses the `placement: inside` option where the aside files are placed next to other project files. The `placement: aside` option to create a mirror directory structure with only the docs. Either way, aside CLI script parses the docs in the same way and produces same results.

```
NSLTR-project (aside root, git root)
.. aside.template
.. aside.doc
.. code
   .. service
      .. aside.doc
      .. <src folder>
      .. <test folder>
   .. web_app
      .. aside.doc
      .. <src folder>
```

In this example, root node is the NSLTR-project directory. It contains the aside.template file as well as the doc document that is used to descrice the project itself. The code directory has two sub-projects, a backend service and the web_app. Both of these have their doc files.

The key tool is the CLI command that composes the aside_root.doc file out of the whole documentation structure. You can run `aside generate` to create such file. You can then browse your doc on the Aside's Web UI, you can call `aside ui` to run an app that allows you to browse the docs and navigate through the levels starting on the root node.

### Documentation from tests

Aside can be configured to generate additional documents for nodes based on plugins. Plugin for Java projects works by scanning the maven project and looking for JUnit5 tests with @DisplayName annotations. If a correct convention is kept in place, generated doc contains a list of modules/classes and their expectations/test scenarios.

Plugin for given node and child nodes can be configured in the aside template for given node. The core of aside is language agnostic, meaning that as long as the plugin follows a given interface, aside can support documentation generation for that plugin.

### First functionalities

- aside generation: reading the files and constructing the documentation object
- aside ui the presents the documentation object
- Java/Maven plugin for doc generation from tests
- aside template ui for easier template creation

### Future functionalities

- Central webservice for management of documentations for several projects and ability to link them to higher-level trees
- properties, types and dictionary support
- some kind of 'author/contributor' management so docs are assigned to people who worked on the doc and on the given node.
- analytics for competence mapping and management
