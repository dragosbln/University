# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.15

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "C:\Program Files\JetBrains\CLion 2019.1\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "C:\Program Files\JetBrains\CLion 2019.1\bin\cmake\win\bin\cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/matrix_mul_prod_cons.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/matrix_mul_prod_cons.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/matrix_mul_prod_cons.dir/flags.make

CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.obj: CMakeFiles/matrix_mul_prod_cons.dir/flags.make
CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.obj"
	C:\mingw64\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\matrix_mul_prod_cons.dir\main.cpp.obj -c C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\main.cpp

CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.i"
	C:\mingw64\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\main.cpp > CMakeFiles\matrix_mul_prod_cons.dir\main.cpp.i

CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.s"
	C:\mingw64\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\main.cpp -o CMakeFiles\matrix_mul_prod_cons.dir\main.cpp.s

CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.obj: CMakeFiles/matrix_mul_prod_cons.dir/flags.make
CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.obj: ../Utils.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.obj"
	C:\mingw64\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\matrix_mul_prod_cons.dir\Utils.cpp.obj -c C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\Utils.cpp

CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.i"
	C:\mingw64\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\Utils.cpp > CMakeFiles\matrix_mul_prod_cons.dir\Utils.cpp.i

CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.s"
	C:\mingw64\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\Utils.cpp -o CMakeFiles\matrix_mul_prod_cons.dir\Utils.cpp.s

# Object files for target matrix_mul_prod_cons
matrix_mul_prod_cons_OBJECTS = \
"CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.obj" \
"CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.obj"

# External object files for target matrix_mul_prod_cons
matrix_mul_prod_cons_EXTERNAL_OBJECTS =

matrix_mul_prod_cons.exe: CMakeFiles/matrix_mul_prod_cons.dir/main.cpp.obj
matrix_mul_prod_cons.exe: CMakeFiles/matrix_mul_prod_cons.dir/Utils.cpp.obj
matrix_mul_prod_cons.exe: CMakeFiles/matrix_mul_prod_cons.dir/build.make
matrix_mul_prod_cons.exe: CMakeFiles/matrix_mul_prod_cons.dir/linklibs.rsp
matrix_mul_prod_cons.exe: CMakeFiles/matrix_mul_prod_cons.dir/objects1.rsp
matrix_mul_prod_cons.exe: CMakeFiles/matrix_mul_prod_cons.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Linking CXX executable matrix_mul_prod_cons.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\matrix_mul_prod_cons.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/matrix_mul_prod_cons.dir/build: matrix_mul_prod_cons.exe

.PHONY : CMakeFiles/matrix_mul_prod_cons.dir/build

CMakeFiles/matrix_mul_prod_cons.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\matrix_mul_prod_cons.dir\cmake_clean.cmake
.PHONY : CMakeFiles/matrix_mul_prod_cons.dir/clean

CMakeFiles/matrix_mul_prod_cons.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\cmake-build-debug C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\cmake-build-debug C:\Users\georg\Desktop\University\Semester5\PPD\matrix_mul_prod_cons\cmake-build-debug\CMakeFiles\matrix_mul_prod_cons.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/matrix_mul_prod_cons.dir/depend

