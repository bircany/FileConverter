# FileConverter

FileConverter is a Java project designed to convert files between different formats. It supports a variety of file types and offers an easy-to-use interface for batch file conversion.

## Features

- **Multiple Format Support**: Convert files between formats such as PDF, DOCX, TXT, PNG, JPG, and more.
- **Batch Conversion**: Convert multiple files at once to save time.
- **Simple Interface**: Easy-to-use command-line interface for quick conversions.
- **Cross-Platform**: Works on Windows, macOS, and Linux.

## Installation

To use FileConverter, clone the repository and compile the project using Maven:

```bash
bashKodu kopyala
git clone https://github.com/yourusername/FileConverter.git
cd FileConverter
mvn clean install

```

## Usage

After compiling the project, you can start converting files using the following command:

```bash
bashKodu kopyala
java -jar FileConverter.jar --input <input_file> --output <output_format>

```

### Example

To convert a PDF file to a DOCX file:

```bash
bashKodu kopyala
java -jar FileConverter.jar --input document.pdf --output docx

```

### Options

- **`-input`**: Path to the input file you want to convert.
- **`-output`**: Desired output file format (e.g., pdf, docx, txt, png, jpg).

## Supported Formats

- **Text Documents**: `.pdf`, `.docx`, `.txt`
- **Images**: `.png`, `.jpg`, `.jpeg`
- **Others**: More formats can be added as needed.

## Contributing

Contributions are welcome! If you have ideas for improvements or find any bugs, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.

## Contact

For any inquiries or issues, please contact yourname@example.com.
