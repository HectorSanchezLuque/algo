import { Platform, StyleSheet, Text, View, Image, Button, TextInput } from 'react-native';
import axios from 'axios';
import { useState } from 'react';

export default function App() {
    const [image, setImage] = useState("https://cdn2.thecatapi.com/images/an1.jpg")
    const [id, setID] = useState();
    const [login, setLogin] = useState();
    const [indice, setIndice] = useState();

    const getDatos = async () => {
        try {
            const response = await axios.get('https://api.github.com/search/users?q=David')
            console.log(response.data.items[5])
            setImage(response.data.items[5].avatar_url)
            setID(response.data.items[5].id)
            setLogin(response.data.items[5].login)
        } catch (error) {
            console.error(error);
        }
    };
    const buscar = async () => {
        try {
            console.log(indice + indice)
            const response = await axios.get('https://api.github.com/search/users?q=David')
            setImage(response.data.items[indice].avatar_url)
            setID(response.data.items[indice].id)
            setLogin(response.data.items[indice].login)
        } catch (error) {
            console.error(error);
        }
    }
    return (
        <View style={styles.container}>
            <View style={styles.container}>
                <Image
                    style={{ width: '100%', height: 200, resizeMode: 'stretch' }}
                    source={{ uri: image }}
                />
                <TextInput
                    autoCorrect={false}
                    onChangeText={(text) => this._changeTextInputValue(setIndice)}
                    onSubmitEditing={() => this._addTask()}
                    returnKeyType={'done'}
                    style={styles.textInput}
                    value={0}
                />
                <Text>{login}</Text>
                <Text>{id}</Text>
            </View>
            <Button onPress={buscar} title="Pulsame!" />
        </View>
    );
}
const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        backgroundColor: '#ecf0f1',
        padding: 8,
    }
});
