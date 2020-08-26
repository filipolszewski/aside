# aside
Aside - Anti-Legacy Codebase Documentation Tool

Currently in setup/design stage. See the `./design` directory for current design perspectives.

# Vision

The beginning was fine - your monolithic system was developed from scratch by your employees and they understood the whole codebase. Your architect documented the key decisions, drivers and tradeoff's, so any future development can be aligned with his vision to keep the architecture clean and scalable. Your developers followed good automated testing practices, so codebase documentation could be fully based on the set of higher level test cases.

Then it all started to grow. The codebase had to be splitted into smaller undependent parts and developers were splitted into teams. Newcomers have joined and unfortunately some of the employees have left which means that the competence transfer process has to be defined to keep the teams well informed. The architect now operates on a higher level and some of the architectural decisions are now made by developers. He puts his 'architectural decisions' documentation aside lately, so it has started to be outdated. The testing practices started to vary from team to team, with some of the tests being written on a very low-level only and some of the test coverage missing.

At this point, there are a lot of hard decisions to be made and the project's future can land somewhere between two points: slow-moving chaos of heavy processes or agile, modular project with competence and responsibility distribution.

Our vision is to help you keep proper distance from the chaos scenario without dragging development efficiency down and limiting agility. 

## **Aside**

Aside is a codebase documentation tool from the future. In the future, documentation tools are not 'heavy document storage systems', where the 'killer feature' is integration with another heavy project management tool. Aside redefines codebase documentation process, with key principles being:

- Compliance **and strengthening** of Agile methodologies used in the project
- Flexibility and customization for self-organizing teams
- DRY-ness: Documentation only where it's needed
- Insightful measurements for data-driven competence management