import { Platform, StyleSheet, Text, View, Image, Button } from 'react-native';
import axios from 'axios';
import { useState } from 'react';

export default function App() {
    const [image, setImage] = useState("https://cdn2.thecatapi.com/images/an1.jpg")
    const [image2, setImage2] = useState("https://cdn2.thecatapi.com/images/an2.jpg")
    const getDatos = async () => {
        try {
            const response = await axios.get('https://api.thecatapi.com/v1/images/search?size=full');
            const response2 = await axios.get('https://api.thecatapi.com/v1/images/search?size=full');
            if (response.data[0] != " "){
                setImage(response.data[0].url)
                setImage2(response2.data[0].url)
            }
        } catch (error) {
            console.error(error);
        }
    };
    return (
        <View style={styles.container}>
            <View style={styles.container}>
                <Image
                    style={{ width: '100%', height: 200, resizeMode: 'stretch' }}
                    source={{ uri: image }}
                />
                <Image
                    style={{ width: '100%', height: 200, resizeMode: 'stretch' }}
                    source={{ uri: image2 }}
                />
            </View>
            <Button onPress={getDatos} title="Pulsame!" />
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
